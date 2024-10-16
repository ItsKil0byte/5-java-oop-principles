package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Logger logger = new Logger("FirstLogger");
        logger.setLevel(LoggerLevel.INFO);

        logger.info("Это информационное сообщение");
        logger.debug("Это сообщение не должно быть видно");

        logger.warning("Это сообщение об предупреждении: %s%n", "Завтра защита лабы.");

        Logger sameLogger = Logger.getLogger("FirstLogger");
        System.out.println(logger == sameLogger);
    }
}
