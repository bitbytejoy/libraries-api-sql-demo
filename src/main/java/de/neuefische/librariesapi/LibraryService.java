package de.neuefische.librariesapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryService {
    private final LibraryRepository libraryRepository;

    public List<Library> findAll() {
        return libraryRepository.findAll();
    }

    public Library save(Library library) {
        return libraryRepository.save(library);
    }

    public void delete(long id) {
        libraryRepository.deleteById(id);
    }
}
