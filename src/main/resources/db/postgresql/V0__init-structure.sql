CREATE TABLE artist (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(255) NOT NULL
);

CREATE TABLE genre (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL
);

CREATE TABLE music_record (
                         id SERIAL PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         artist_id INTEGER NOT NULL,
                         genre_id INTEGER NOT NULL,
                         FOREIGN KEY (artist_id) REFERENCES artist(id),
                         FOREIGN KEY (genre_id) REFERENCES genre(id)
);