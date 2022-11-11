CREATE TABLE library2_schema.books
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 ),
    title character(128),
    description text,
    CONSTRAINT primary_key_books PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS library2_schema.books
    OWNER to neuefische;