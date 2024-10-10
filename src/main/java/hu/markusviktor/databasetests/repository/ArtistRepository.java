package hu.markusviktor.databasetests.repository;

import hu.markusviktor.databasetests.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    // Custom queries can be defined here if needed
}
