package com.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
