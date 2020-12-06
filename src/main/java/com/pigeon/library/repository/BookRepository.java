package com.pigeon.library.repository;

import com.pigeon.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BookRepository extends JpaRepository<Book,Long>, QuerydslPredicateExecutor<Book> {


}
