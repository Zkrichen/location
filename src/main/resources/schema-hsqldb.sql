CREATE TABLE Appartement(
    id BIGINT IDENTITY PRIMARY KEY,
    name VARCHAR(255),
    superficie INT,
    batiment VARCHAR(255),
    adresse VARCHAR(255),
    equipement VARCHAR(255) );

    CREATE TABLE Client(
    id BIGINT IDENTITY PRIMARY KEY,
    name VARCHAR(255),
    cin VARCHAR(255),
    notation VARCHAR(255),
    adresse VARCHAR(255),
    typeClient VARCHAR(255),
    comment VARCHAR(255)
    );
