/*CREATE TABLE author (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(100) NOT NULL
);

CREATE TABLE genre (
                       id SERIAL PRIMARY KEY,
                       name_genre VARCHAR(255) NOT NULL);
CREATE TABLE book (
                      id SERIAL PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      author_id INT NOT NULL,
                      genre_id INT NOT NULL,
                      public_year SMALLINT NULL,
                      CONSTRAINT fk_author FOREIGN KEY(author_id) REFERENCES author(id),
                      CONSTRAINT fk_genre FOREIGN KEY(genre_id) REFERENCES genre(id));

INSERT INTO author(id, name) VALUES (1,'Harper Lee'),
                                    (2,'George Orwell'),
                                    (3,'Virginia Woolf'),
                                    (4,'J.R.R. Tolkien');

INSERT INTO genre (id,name_genre) VALUES  (1,'Fantasy'),
                                          (2, 'Adventure'),
                                          (3, 'Classic'),
                                          (4,'Novels'),
                                          (5,'Poetry'),
                                          (6,'Detective');
INSERT INTO book values (1,'Убить пересмешника',1,3,1960),
                        (2, 'На маяк',3,4,1927),
                        (3,'Властелин колец',4,1,1954),
                        (4,'Хоббит',4,1,1927);*/
/*

SELECT  b.title, a.name, g.name_genre from book b left join author a on a.id = b.author_id
                                                  left join genre g on b.genre_id = g.id;

update author set name='VIRGINIA' where name like '%Virginia%';

DELETE from genre where lower(name_genre) like '%detective%';
Select * from genre;

DROP table genre cascade;

Select * from book;*/
