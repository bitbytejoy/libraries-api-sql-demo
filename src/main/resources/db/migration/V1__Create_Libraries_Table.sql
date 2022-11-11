CREATE TABLE library2_schema.libraries
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
    name character(128),
    address character(256),
    CONSTRAINT libraries_primary_key PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS library2_schema.libraries
    OWNER to neuefische;