package lab12.ex5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class SizeOf {
    public static void main(String[] args) {
        
        Visitor visitor = new Visitor();

        if (args.length == 0) {
            System.out.println("Usage: java SizeOf <directory>");
            System.exit(1);
        } else if (args.length == 1) {

            try {
                Stream<Path> files = Files.walk(java.nio.file.Paths.get(args[0]), 0);
                files.forEach(file -> {
                    try {
                        java.nio.file.attribute.BasicFileAttributes attrs = Files.readAttributes(file, java.nio.file.attribute.BasicFileAttributes.class);
                        visitor.visitFile(file, attrs);
                    } catch (java.io.IOException e) {
                        System.out.println("Error: " + e);
                    }
                });

                files.close();
            } catch (java.io.IOException e) {
                System.out.println("Error: " + e);
            }

        } else if (args.length == 2 && args[0].equals("-r")) {

            try {
                Files.walkFileTree(java.nio.file.Paths.get(args[1]), visitor);
            } catch (java.io.IOException e) {
                System.out.println("Error: " + e);
            }

        } else {
            System.out.println("Usage: java SizeOf <directory> [-r]");
            System.exit(1);
        }

        // Get the files and their sizes and display them
        java.util.HashMap<java.nio.file.Path, Long> files = visitor.getFiles();

        long totalSize = 0;
        for (java.util.Map.Entry<java.nio.file.Path, Long> entry : files.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " bytes");
            totalSize += entry.getValue();
        }

        System.out.println("Total size: " + totalSize + " bytes");
        System.out.println("Total size: " + totalSize / 1024 + " KB");
    }
}
