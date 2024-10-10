CREATE TABLE artist (
                         id INT IDENTITY(1,1) PRIMARY KEY,
                         name VARCHAR(255) NOT NULL
);

CREATE TABLE genre (
                        id INT IDENTITY(1,1) PRIMARY KEY,
                        name VARCHAR(255) NOT NULL
);

CREATE TABLE music_record (
                         id INT IDENTITY(1,1) PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         artist_id INT NOT NULL,
                         genre_id INT NOT NULL,
                         FOREIGN KEY (artist_id) REFERENCES artist(id),
                         FOREIGN KEY (genre_id) REFERENCES genre(id)
);