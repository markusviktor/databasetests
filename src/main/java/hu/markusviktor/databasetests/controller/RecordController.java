package hu.markusviktor.databasetests.controller;

import hu.markusviktor.databasetests.model.MusicRecord;
import hu.markusviktor.databasetests.repository.RecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    private final RecordRepository recordRepository;

    public RecordController(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    @PostMapping("/")
    public MusicRecord createRecord(@RequestBody MusicRecord musicRecord) {
        return recordRepository.save(musicRecord);
    }

    @GetMapping("/")
    public List<MusicRecord> getAllRecords() {
        return recordRepository.findAll();
    }
}
