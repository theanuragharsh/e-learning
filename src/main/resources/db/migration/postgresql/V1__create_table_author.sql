create sequence "e-learning".auth_sequence start with 10000 increment by 1;
create table "e-learning".author (
        age integer,
        author_id integer not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (author_id)
    );