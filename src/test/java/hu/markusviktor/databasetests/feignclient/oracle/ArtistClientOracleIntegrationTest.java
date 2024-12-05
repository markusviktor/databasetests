package hu.markusviktor.databasetests.feignclient.oracle;

import hu.markusviktor.databasetests.extension.MssqlExtension;
import hu.markusviktor.databasetests.extension.OracleExtension;
import hu.markusviktor.databasetests.feignclient.ArtistClientIntegrationTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@Tags({
        @Tag("integration"),
        @Tag(OracleExtension.TEST_TAG)
})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(OracleExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
class ArtistClientOracleIntegrationTest extends ArtistClientIntegrationTest {

}