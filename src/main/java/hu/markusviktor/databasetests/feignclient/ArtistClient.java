package hu.markusviktor.databasetests.feignclient;


import hu.markusviktor.databasetests.model.Artist;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "artistClient", url = "${artist.service.url}")
public interface ArtistClient {

    @PostMapping("/api/artists/")
    Artist createArtist(@RequestBody Artist artist);

    @GetMapping("/api/artists/")
    List<Artist> getAllArtists();
}
