package com.bandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.bandiClasses.DMS.Models.Dog;


/**
 * 
 * @author Venkata Srinivasa Bhargav Varma Sagi
 * 
 */

public interface DogRepository extends CrudRepository<Dog , Integer> {
	List<Dog> findByName(String Name);
	

}
