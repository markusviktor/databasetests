package hu.markusviktor.databasetests.extension;

import org.testcontainers.oracle.OracleContainer;


public class OracleExtension extends AbstractTestDatabaseExtension<OracleContainer> {
    private final static String dockerImageName = "gvenzl/oracle-free:latest";
    private static final String migrationSubfolderName = "oracle";

    @Override
    public OracleContainer getContainer() {
        try (OracleContainer container = new OracleContainer(dockerImageName)) {
            return container;
        }
    }

    @Override
    public String getMigrationSubFolderName() {
        return migrationSubfolderName;
    }
}
