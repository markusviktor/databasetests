package hu.markusviktor.databasetests.controller;

import hu.markusviktor.databasetests.model.Artist;
import hu.markusviktor.databasetests.repository.ArtistRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {

    private final ArtistRepository artistRepository;

    public ArtistController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @PostMapping("/")
    public Artist createArtist(@RequestBody Artist artist) {
        return artistRepository.save(artist);
    }

    @GetMapping("/")
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
