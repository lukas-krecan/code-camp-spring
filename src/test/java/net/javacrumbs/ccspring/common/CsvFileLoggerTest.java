package net.javacrumbs.ccspring.common;

public class CsvFileLoggerTest extends AbstractMessageStoreTest {
    protected ReadableLogger createLogger() {
        return new CsvFileLogger();
    }
}