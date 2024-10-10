package hu.markusviktor.databasetests.repository;

import hu.markusviktor.databasetests.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    // Custom queries can be defined here if needed
}
