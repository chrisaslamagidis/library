package com.pigeon.library.controller;

import com.pigeon.library.dto.BookDTO;
import com.pigeon.library.sevice.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRestController {

    @Autowired
    BookService bookService;

    @GetMapping("")
    public List<BookDTO> findAll() {
        List<BookDTO> booksDTO = bookService.findAll();
        if (booksDTO.isEmpty()) {
            throw new RuntimeException("There aren't products available");
        }

        return booksDTO;
    }

}
