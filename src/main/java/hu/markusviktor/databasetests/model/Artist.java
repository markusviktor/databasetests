package hu.markusviktor.databasetests.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MusicRecord> musicRecords;
}
