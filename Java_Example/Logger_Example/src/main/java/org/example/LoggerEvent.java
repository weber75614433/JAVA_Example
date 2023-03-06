package org.example;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerEvent {
    public void logRecorder(String name){
        Logger logger = Logger.getLogger(name);
        logger.setLevel(Level.INFO);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.OFF);

        logger.addHandler(consoleHandler);

        try{
            FileHandler fileHandler = new FileHandler("D:\\GitHUB\\Logger_Testing.txt", true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new LoggerFormat());
            logger.addHandler(fileHandler);

        }catch(SecurityException | IOException e){
            e.printStackTrace();
        }

        logger.info("Start");
        logger.info("Running");
        logger.info("End");


    }
}
