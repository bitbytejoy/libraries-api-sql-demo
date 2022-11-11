package de.neuefische.librariesapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
@RequiredArgsConstructor
public class LibraryController {
    private final LibraryService libraryService;

    @GetMapping
    public List<Library> getAll () {
        List<Library> libraries = libraryService.findAll();
        libraries.forEach(
                library -> library.getBooks().forEach(
                        book -> book.setLibraries(null)
                )
        );
        return libraries;
    }

    @PostMapping
    public Library create(@RequestBody Library library) {
        return libraryService.save(library);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable long id) {
        libraryService.delete(id);
    }
}
