package com.majkel.springDemo.repositories;

import com.majkel.springDemo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
