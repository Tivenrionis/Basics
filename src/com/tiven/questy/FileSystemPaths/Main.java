package com.tiven.questy.FileSystemPaths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);

/*        Path filePath = FileSystems.getDefault().getPath("Files", "SubdirectoryFile.txt");
        printFile(filePath);*/

        Path filePath = Paths.get(".", "Files", "SubdirectoryFile.txt");
        printFile(filePath);

        filePath = Paths.get("C:\\Users\\tiven\\OneDrive\\Pulpit\\Path\\OutOfWD.txt");
        printFile(filePath);

        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path1 = FileSystems.getDefault().getPath(".", "Files", "..", "Files", "SubdirectoryFile.txt");
        System.out.println(path1.normalize().toAbsolutePath());
        printFile(path1.normalize());

        Path path2 = FileSystems.getDefault().getPath("doesntexist.txt");
        System.out.println(path2.toAbsolutePath());

        Path path3 = Paths.get("Z:\\Users\\tiven\\OneDrive\\Pulpit\\Path\\OutOfWD.txt");
        System.out.println(path3.toAbsolutePath());

        filePath = FileSystems.getDefault().getPath("Files");
        System.out.println("Exists: " + Files.exists(filePath));
        System.out.println("Exists: " + Files.exists(path3));


    }

    private static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;

            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
