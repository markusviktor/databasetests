package hu.markusviktor.databasetests.extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.JdbcDatabaseContainer;

public abstract class AbstractTestDatabaseExtension<DatabaseVendorContainer extends JdbcDatabaseContainer<?>> implements BeforeAllCallback, AfterAllCallback {

    private final DatabaseVendorContainer container = getContainer();

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        container.start();
        System.setProperty("spring.datasource.driver-class-name", container.getDriverClassName());
        System.setProperty("spring.datasource.url", container.getJdbcUrl());
        System.setProperty("spring.datasource.jdbc-url", container.getJdbcUrl());
        System.setProperty("spring.datasource.username", container.getUsername());
        System.setProperty("spring.datasource.password", container.getPassword());
        System.setProperty("spring.flyway.locations", "classpath:db/" + getMigrationSubFolderName());
        System.setProperty("spring.flyway.enabled", "true");
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) {
        container.stop();
    }


    public abstract DatabaseVendorContainer getContainer();

    public abstract String getMigrationSubFolderName();
}
