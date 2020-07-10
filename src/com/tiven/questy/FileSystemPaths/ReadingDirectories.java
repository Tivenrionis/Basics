package com.tiven.questy.FileSystemPaths;

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

        Path directory = FileSystems.getDefault().getPath("Examples\\Dir2");
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

    }
}
