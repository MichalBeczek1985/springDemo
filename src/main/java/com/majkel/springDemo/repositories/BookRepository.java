package com.majkel.springDemo.repositories;

import com.majkel.springDemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
