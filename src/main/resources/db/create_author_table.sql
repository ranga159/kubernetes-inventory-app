CREATE TABLE inventory_schema.author (
  id bigserial not null,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  created timestamp not null,
  created_by varchar(100) not null,
  modified timestamp not null,
  modified_by varchar(100) not null,
  PRIMARY KEY (id)
);