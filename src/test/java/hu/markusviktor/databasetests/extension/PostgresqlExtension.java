package hu.markusviktor.databasetests.extension;

import org.junit.jupiter.api.BeforeAll;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.lifecycle.Startables;

import java.util.stream.Stream;

public class PostgresqlExtension extends AbstractTestDatabaseExtension<PostgreSQLContainer<?>> {
    private static final String dockerImageName = "postgres:latest";
    private static final String migrationSubfolderName = "postgresql";
    public static final String TEST_TAG = "postgresql";


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
