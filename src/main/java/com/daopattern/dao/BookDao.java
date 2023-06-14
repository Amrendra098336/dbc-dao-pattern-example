package com.daopattern.dao;

import com.daopattern.domain.Book;

import java.util.Optional;

public interface BookDao {
    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);
}
