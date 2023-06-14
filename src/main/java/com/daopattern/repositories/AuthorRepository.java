package com.daopattern.repositories;

import com.daopattern.domain.Author;
import com.daopattern.domain.Book;
import com.sun.jdi.BooleanValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
