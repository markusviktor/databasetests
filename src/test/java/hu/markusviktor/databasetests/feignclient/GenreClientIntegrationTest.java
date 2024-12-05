package hu.markusviktor.databasetests.feignclient;

import hu.markusviktor.databasetests.extension.OracleExtension;
import hu.markusviktor.databasetests.model.Genre;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class GenreClientIntegrationTest {

    @Autowired
    private GenreClient genreClient;

    @Test
    void integrationTest() {
        List<Genre> allGenres = genreClient.getAllGenres();
        assertEquals(0, allGenres.size());

        Genre testGenre = new Genre();
        testGenre.setName("Punk Rock");
        Genre createdGenre = genreClient.createGenre(testGenre);
        assertEquals(testGenre.getName(), createdGenre.getName());

        allGenres = genreClient.getAllGenres();
        assertEquals(1, allGenres.size());
    }
}