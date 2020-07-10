package com.tiven.questy.FileSystemPaths;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoriesMain {
    public static void main(String[] args) {
        try {
            //Moving - renaming
            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path destination = FileSystems.getDefault().getPath("Examples", "file2.txt");
            Files.move(fileToMove, destination);
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "filecopy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);


//Kopiuje tylko folder bez zawartosci
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile,copyFile,StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
