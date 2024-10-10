CREATE TABLE artist (
                         id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         name VARCHAR2(255) NOT NULL
);

CREATE TABLE genre (
                        id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                        name VARCHAR2(255) NOT NULL
);

CREATE TABLE music_record (
                         id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                         title VARCHAR2(255) NOT NULL,
                         artist_id NUMBER NOT NULL,
                         genre_id NUMBER NOT NULL,
                         FOREIGN KEY (artist_id) REFERENCES artist(id),
                         FOREIGN KEY (genre_id) REFERENCES genre(id)
);