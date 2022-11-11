package de.neuefische.librariesapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
    void deleteById(long id);
}
