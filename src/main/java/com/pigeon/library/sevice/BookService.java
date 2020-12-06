package com.pigeon.library.sevice;

import com.pigeon.library.dto.BookDTO;

import java.util.List;

public interface BookService {

     List<BookDTO> findAll();
     BookDTO findById(Long id);
     void save(BookDTO bookDTO);
     void deleteById(Long id);
     void update(BookDTO bookDTO);

}
