package hu.markusviktor.databasetests.feignclient;

import hu.markusviktor.databasetests.model.MusicRecord;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "recordClient", url = "${record.service.url}")
public interface MusicRecordClient {

    @PostMapping("/api/records/")
    MusicRecord createRecord(@RequestBody MusicRecord musicRecord);

    @GetMapping("/api/records/")
    List<MusicRecord> getAllRecords();
}
