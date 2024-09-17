package main.java;

import java.util.logging.Logger;

public class CustomClass {
    static Logger logger = Logger.getLogger(CustomClass.class.getName());

    private CustomClass(){

    }
    public static void main(String[] args) {
        logger.info("Hello gitHub Actions");
    }
}