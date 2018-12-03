package com.rest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long>{
}
