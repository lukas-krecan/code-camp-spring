package net.javacrumbs.ccspring.common;

public class InMemoryLoggerTest extends AbstractMessageStoreTest {
    protected ReadableLogger createLogger() {
        return new InMemoryLogger();
    }
}