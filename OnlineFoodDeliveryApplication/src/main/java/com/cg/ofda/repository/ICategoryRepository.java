package com.cg.ofda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ofda.dto.CategoryDto;

import com.cg.ofda.dto.CustomerDto;

import com.cg.ofda.dto.RestaurantDto;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryDto, String> {
	
	
	

}

