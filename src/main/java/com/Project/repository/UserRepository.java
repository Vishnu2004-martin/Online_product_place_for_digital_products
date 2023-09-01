package com.Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Project.model.User;

import jakarta.transaction.Transactional;
public interface UserRepository extends JpaRepository<User, Integer>{
	//native Query
	@Query(value = "select * from user where name=:s ",nativeQuery = true)
	public List<User> getAllRows(@Param("s") String name);
	
	
	//delete using native query
	@Modifying
	@Transactional
	@Query(value = "delete from user where userid=:id ",nativeQuery = true)
	public int deleteId(@Param("id") int userid);
    
	@Modifying
	@Transactional
	@Query(value="select * from user join  = _product._order.id where _order.id = ?1",nativeQuery=true)
	User getUserData(int id);


	public List<User> save(int userid);
	


}
