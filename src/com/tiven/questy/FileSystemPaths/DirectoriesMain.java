package com.tiven.questy.FileSystemPaths;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class DirectoriesMain {
    public static void main(String[] args) {
        try {
            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size of a file " + size);
            System.out.println("Last modified " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size= " + attributes.size());
            System.out.println("LastModified = " + attributes.lastModifiedTime());
            System.out.println("Created= " + attributes.creationTime());
            System.out.println("Is a directory= " + attributes.isDirectory());
            System.out.println("Is regular file = " + attributes.isRegularFile());


//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            //1% na uzycie... pliki powstaja same przy otwieraniu kanalow itd aczkolwiek its here
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//            Files.createDirectories(dirToCreate);
            //            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
            //            Files.createDirectories(dirToCreate);
            //            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
            //            Files.createDirectory(dirToCreate);

//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "filecopy.txt");
//            Files.deleteIfExists(fileToDelete);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
