package lab12.ex5;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;

public class Visitor extends SimpleFileVisitor<Path> {

    private HashMap<Path, Long> files = new HashMap<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws java.io.IOException {
        files.put(file, attrs.size());
        return FileVisitResult.CONTINUE;
    }

    public HashMap<Path, Long> getFiles() {
        return files;
    }

}