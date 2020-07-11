package com.tiven.questy.FileSystemPaths;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class ReadingDirectories {
    public static void main(String[] args) {
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path path) throws IOException {
                return Files.isRegularFile(path);
            }
        };
        DirectoryStream.Filter<Path> filter1 = p -> Files.isRegularFile(p);

        //  Path directory = FileSystems.getDefault().getPath("Examples\\Dir2");
        Path directory = FileSystems.getDefault().getPath("Examples" + File.separator + "Dir2");
//implements Iterable so u can iterate
        // try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory,"*.dat")) {
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter1)) {
            for (Path path : contents) {
                System.out.println(path.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //NEVER HARDCODE SEPARATOR
        String sep = File.separator;
        System.out.println(sep);
        sep = FileSystems.getDefault().getSeparator();
        System.out.println(sep);

        try {
            Path temp = Files.createTempFile("myapp", "appext");
            System.out.println("Temp is on " + temp.toAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println(store);
            System.out.println(store.name());
        }
        System.out.println("========================");
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths) {
            System.out.println(path);
        }

        System.out.println("Walking Tree for Dir2");
        Path dir2Path = FileSystems.getDefault().getPath("Examples", File.separator, "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("====Copy Dir2 to Dir4/Dir2Copy=====");
        Path copyPath = FileSystems.getDefault().getPath("Examples", File.separator, "Dir4" + File.separator + "Dir2Copy");
        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
