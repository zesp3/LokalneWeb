DROP TABLE IF EXISTS articles;
CREATE TABLE articles(id serial PRIMARY KEY, artname VARCHAR(510), arttext VARCHAR(5000), artimage VARCHAR(500), artsource VARCHAR(50), artdate DATE);