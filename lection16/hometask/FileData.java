package com.itea.dimka.lection16.hometask;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileData {
    public static String map(String stringPath) {
        Path path = Paths.get(stringPath);
        if (Files.notExists(path)) {
            return null;
        }

        StringBuffer stringBuffer = new StringBuffer();
        String result = "";

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(s -> {
                stringBuffer.append(s);
                stringBuffer.append("\n");
            });
            result = stringBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
