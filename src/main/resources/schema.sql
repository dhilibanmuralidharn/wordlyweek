create table if not exists writer(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name TEXT,
    bio TEXT
);

create table if not exists magazine(
    id INT PRIMARY KEY AUTO_INCREMENT,
    title TEXT,
    publicationDate TEXT
);

create table if not exists writer_magazine(
    writerId INT,
    magazineId INT,
    PRIMARY KEY (writerId, magazineId),
    FOREIGN KEY (writerId) REFERENCES writer(id),
    FOREIGN KEY (magazineId) REFERENCES magazine(id)
);