package com.pigeon.library.sevice;

import com.pigeon.library.dto.BookDTO;
import com.pigeon.library.mapper.BookMapper;
import com.pigeon.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper bookMapper;


    @Override
    @Transactional
    public List<BookDTO> findAll() {
        return  bookMapper.bookToBookDTO(bookRepository.findAll());
    }

    @Override
    @Transactional
    public BookDTO findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void save(BookDTO bookDTO) {

    }

    @Override
    @Transactional
    public void deleteById(Long id) {

    }

    @Override
    @Transactional
    public void update(BookDTO bookDTO) {

    }
}
