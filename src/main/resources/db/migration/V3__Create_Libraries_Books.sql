CREATE TABLE library2_schema.libraries_books
(
    library_id bigint NOT NULL,
    book_id bigint NOT NULL,
    CONSTRAINT foreign_key_libraries_books_libraries FOREIGN KEY (library_id)
        REFERENCES library2_schema.libraries (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT foreign_key_libraries_books_books FOREIGN KEY (book_id)
        REFERENCES library2_schema.books (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE IF EXISTS library2_schema.libraries_books
    OWNER to neuefische;