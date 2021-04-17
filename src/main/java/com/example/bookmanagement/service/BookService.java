package com.example.bookmanagement.service;

import com.example.bookmanagement.config.ApplicationConfig;
import com.example.bookmanagement.entity.BookEntity;
import com.example.bookmanagement.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

// For runtime Lazy binding of Auto-wired Label objects (using Lombok)
@RequiredArgsConstructor(
        onConstructor = @__({@Autowired, @Lazy}))
@Service
public class BookService {
    private final ApplicationConfig applicationConfig;

    public BookEntity findBookById(final Long bookId) {
        return BookEntity.builder().id(bookId).title("Title").author("Author" + bookId).build();
        // return ResourceNotFoundException("Book", "id", bookId);
    }

    // Create a new Book
    public BookEntity createBook(final BookEntity bookToBeCreated) {
        // do not expose dto and give only req fields
        return bookToBeCreated;
    }

    // Get All Books
    public List<BookEntity> getAllBooks() {
        return Collections.emptyList();
    }

    // Update the book with bookId
    public String updateBook(final Long bookId, final BookEntity bookToBeUpdated) {
        // only update if book exists with the given Id
        findBookById(bookId);
        bookToBeUpdated.setId(bookId);
        return applicationConfig.getBookUpdateSuccess() + bookId;
    }

    // Delete a Book
    public String deleteBook(final Long bookId) {
        // deletes the book with given bookId, using repository findBookById
        // if(bookRepository.existsById(bookId))
        findBookById(bookId);
        return applicationConfig.getBookDeleteSuccess() + bookId;
    }

}