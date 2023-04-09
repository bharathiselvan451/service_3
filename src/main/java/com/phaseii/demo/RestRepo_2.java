package com.phaseii.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel="rest_2",path="rest_2")
public interface RestRepo_2 extends PagingAndSortingRepository<Service_2_model, Integer>, CrudRepository<Service_2_model, Integer> {

	
	List<Service_2_model> findByMail(String mail);
	
	
}
