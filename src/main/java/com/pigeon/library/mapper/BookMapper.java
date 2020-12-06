package com.pigeon.library.mapper;

import com.pigeon.library.dto.BookDTO;
import com.pigeon.library.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDTO bookToBookDTO(Book book);


    Book bookFromBookDTO(BookDTO bookDTO);


    List<BookDTO> bookToBookDTO(List<Book> books );


    List<Book> bookFromBookDTO(List<BookDTO> booksDTO);

}
