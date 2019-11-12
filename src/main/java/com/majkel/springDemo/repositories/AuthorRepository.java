package com.majkel.springDemo.repositories;

import com.majkel.springDemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
