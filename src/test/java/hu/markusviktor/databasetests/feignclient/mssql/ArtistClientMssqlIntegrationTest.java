package hu.markusviktor.databasetests.feignclient.mssql;

import hu.markusviktor.databasetests.extension.MssqlExtension;
import hu.markusviktor.databasetests.extension.PostgresqlExtension;
import hu.markusviktor.databasetests.feignclient.ArtistClient;
import hu.markusviktor.databasetests.feignclient.ArtistClientIntegrationTest;
import hu.markusviktor.databasetests.model.Artist;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tags({
        @Tag("integration"),
        @Tag(MssqlExtension.TEST_TAG)
})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(PostgresqlExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
class ArtistClientMssqlIntegrationTest extends ArtistClientIntegrationTest {


}