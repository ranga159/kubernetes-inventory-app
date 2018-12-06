CREATE TABLE inventory_schema.book (
  id serial not null,
  title VARCHAR(100) NOT NULL,
  author_id int NOT NULL,
  published_date timestamp NOT NULL,
  isbn int,
  created timestamp not null,
  created_by varchar(100) not null,
  modified timestamp not null,
  modified_by varchar(100) not null,
  PRIMARY KEY (id),
  UNIQUE (isbn),
  CONSTRAINT fk_book_author_id_author_id foreign key (author_id) references inventory_schema.author
);