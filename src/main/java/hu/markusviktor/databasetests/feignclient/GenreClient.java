package hu.markusviktor.databasetests.feignclient;

import hu.markusviktor.databasetests.model.Genre;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "genreClient", url = "${genre.service.url}")
public interface GenreClient {

    @PostMapping("/api/genres/")
    Genre createGenre(@RequestBody Genre genre);

    @GetMapping("/api/genres/")
    List<Genre> getAllGenres();
}
