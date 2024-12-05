package hu.markusviktor.databasetests.extension;

import org.testcontainers.oracle.OracleContainer;

import java.time.Duration;


public class OracleExtension extends AbstractTestDatabaseExtension<OracleContainer> {
    private final static String dockerImageName = "gvenzl/oracle-free:latest";
    private static final String migrationSubfolderName = "oracle";
    public static final String TEST_TAG = "oracle";


    @Override
    public OracleContainer getContainer() {
        try (OracleContainer container = new OracleContainer(dockerImageName)) {
            container.withStartupTimeout(Duration.ofMinutes(5));
            return container;
        }
    }

    @Override
    public String getMigrationSubFolderName() {
        return migrationSubfolderName;
    }
}
