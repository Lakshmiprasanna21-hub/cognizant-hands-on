package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.debug("Debugging application...");
        logger.warn("Warning issued");
        logger.error("An error occurred!");
    }
}
