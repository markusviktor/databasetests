package hu.markusviktor.databasetests.extension;

import org.testcontainers.containers.PostgreSQLContainer;

public class PostgresqlExtension extends AbstractTestDatabaseExtension<PostgreSQLContainer<?>> {
    private static final String dockerImageName = "postgres:latest";
    private static final String migrationSubfolderName = "postgresql";

    @Override
    public PostgreSQLContainer<?> getContainer() {
        try(PostgreSQLContainer<?> container = new PostgreSQLContainer<>(dockerImageName)
                    .withDatabaseName("test")
                    .withUsername("test")
                    .withPassword("test")
                    .withExposedPorts(5432)){
        return container;
        }
    }

    @Override
    public String getMigrationSubFolderName() {
        return migrationSubfolderName;
    }

}
