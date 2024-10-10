package hu.markusviktor.databasetests.repository;

import hu.markusviktor.databasetests.model.MusicRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<MusicRecord, Long> {
    // Custom queries can be defined here if needed
}
