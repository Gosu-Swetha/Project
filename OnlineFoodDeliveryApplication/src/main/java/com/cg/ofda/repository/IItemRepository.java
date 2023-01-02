package com.cg.ofda.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ofda.dto.ItemDto;

@Repository
public interface IItemRepository extends JpaRepository<ItemDto, String>{
//	@Query("select u from ItemDto u where u.ItemName=:u1")
//	public List<ItemDto> viewAllItemsByName(@Param("u1") String itemName);
}