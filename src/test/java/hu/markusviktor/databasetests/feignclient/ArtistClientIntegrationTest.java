package hu.markusviktor.databasetests.feignclient;

import hu.markusviktor.databasetests.model.Artist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public abstract class ArtistClientIntegrationTest {

    @Autowired
    private ArtistClient artistClient;

    @Test
    void integrationTest() {
        List<Artist> allArtists = artistClient.getAllArtists();
        assertEquals(0, allArtists.size());

        Artist testArtist = new Artist();
        testArtist.setName("Green Day");
        Artist createdArtist = artistClient.createArtist(testArtist);
        assertEquals(testArtist.getName(), createdArtist.getName());

        allArtists = artistClient.getAllArtists();
        assertEquals(1, allArtists.size());
    }
}