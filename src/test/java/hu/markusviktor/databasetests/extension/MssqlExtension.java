package hu.markusviktor.databasetests.extension;

import org.testcontainers.containers.MSSQLServerContainer;

public class MssqlExtension extends AbstractTestDatabaseExtension<MSSQLServerContainer<?>> {
    private static final String dockerImageName = "mcr.microsoft.com/mssql/server:latest";
    private static final String migrationSubfolderName = "mssql";

    @Override
    public MSSQLServerContainer<?> getContainer() {
        try(MSSQLServerContainer<?> container = new MSSQLServerContainer<>(dockerImageName)
                .acceptLicense()){
            return container;
        }
    }

    @Override
    public String getMigrationSubFolderName() {
        return migrationSubfolderName;
    }

}
