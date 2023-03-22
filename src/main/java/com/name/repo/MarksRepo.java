package com.name.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.name.model.Marks;
@Repository
public interface MarksRepo extends CrudRepository<Marks, Integer> {

}
