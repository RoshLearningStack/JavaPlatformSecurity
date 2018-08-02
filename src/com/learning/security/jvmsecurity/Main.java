package com.learning.security.jvmsecurity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println(version);

        try {
            FileWriter writer = new FileWriter("c:/temp/out.txt");
            writer.write("Hello world!");
        } catch (IOException e) {
            logger.log(Level.ALL, e.getMessage());
        }

    }

}
