package com.cg.ofda.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ofda.dto.RestaurantDto;

@Repository
	public interface IRestaurantRepository extends JpaRepository<RestaurantDto,String>{

//		@Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
//		User findUserByUserStatusAndUserName(@Param("status") Integer userStatus, 
//		  @Param("name") String userName);
	//
	//	@Query("select r from RestaurantDto r where adddress=:location")
		//public List<RestaurantDto> viewNearByRestaurant(@Param("location") String location);
		
	}

