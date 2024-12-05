package hu.markusviktor.databasetests.feignclient.posgresql;

import hu.markusviktor.databasetests.extension.PostgresqlExtension;
import hu.markusviktor.databasetests.feignclient.GenreClientIntegrationTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@Tags({
        @Tag("integration"),
        @Tag(PostgresqlExtension.TEST_TAG)
})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(PostgresqlExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
class GenreClientPostgresqlIntegrationTest extends GenreClientIntegrationTest {


}