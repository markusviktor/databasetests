package hu.markusviktor.databasetests.controller;

import hu.markusviktor.databasetests.model.Genre;
import hu.markusviktor.databasetests.repository.GenreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    private final GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @PostMapping("/")
    public Genre createGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

    @GetMapping("/")
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}