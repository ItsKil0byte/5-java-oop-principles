package com.example.task04;

import java.time.temporal.ChronoUnit;

public class Task04Main {
    public static void main(String[] args) {
        Logger logger = new Logger("FirstLogger");

        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);

        FileHandler fileHandler = new FileHandler("log.txt");
        logger.addHandler(fileHandler);

        // RotationFileHandler rotationFileHandler = new RotationFileHandler(ChronoUnit.HOURS);
        // logger.addHandler(rotationFileHandler);

        // MemoryHandler memoryHandler = new MemoryHandler(3, new ConsoleHandler());
        // logger.addHandler(memoryHandler);

        logger.debug("Это дебаг сообщение.");
        logger.info("Это информационное сообщение.");
        logger.warning("Это сообщение о предупреждении.");

        logger.error("Ошибка с шаблоном: %s", "Вы забыли точку с запятой.");

        logger.info("Тест буфера.");
        logger.info("Тест буфера.");
        logger.info("Отправляем сообщения!");
        logger.info("Отправим ещё одно сообщение в буфер.");

        // memoryHandler.send();
    }
}
