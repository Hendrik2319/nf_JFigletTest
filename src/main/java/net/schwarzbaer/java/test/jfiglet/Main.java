package net.schwarzbaer.java.test.jfiglet;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(generateAsciiArt("Hello world!"));
    }

    private static String generateAsciiArt(String str) {
        try {
            return FigletFont.convertOneLine(str);
        } catch (IOException e) {
            System.err.printf("IOException while generating output for \"%s\": %s%n", str, e.getMessage());
            return "Sorry, can't generate output.";
        }
    }
}