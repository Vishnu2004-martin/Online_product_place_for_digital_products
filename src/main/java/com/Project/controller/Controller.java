package com.Project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.model.User;
import com.Project.service.Service;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin("http://localhost:3000")
public class Controller {
	
	private final static Logger logger = LoggerFactory.getLogger(Controller.class);
	@Autowired
	public Service tserv;
	@GetMapping("/getUserData/{id}")
	public ResponseEntity<User>getUserData(@PathVariable int id){
		
		
		return ResponseEntity.status(200).body(tserv.getUserData(id));
		
	}
	//posting the data
	@PostMapping("/insertingDetails")
	public String insertingDetails(@RequestBody User t)
	{
		 tserv.postData(t);
		 return "Your data is saved successfully";
	}
	@GetMapping("/gettingDetails")
	public List<User> gettingData(){
		System.out.println("SOP");
		logger.info("This is Bucks Bunny");
		logger.debug("debug");
		logger.warn("warn");
		logger.error("error");
		return tserv.getData();
	}
	@PutMapping("/update/{userid}")
	public String update(@PathVariable int userid,@RequestBody User t){
		 tserv.save(t);
		 return "updated successfully";
	}
	//get all row
	@GetMapping("/getAllrows/{name}")
	public List<User> getAllRows(@PathVariable String name)
	{
		return tserv.getbyname(name);
	}

//	@GetMapping("/getByName/{char}")
//	public List<User> getByName(@PathVariable("char") String name)
//	{
//		return tserv.getDataByChar(name);
//	}
	//delete data
	@DeleteMapping("/deleteRow/{id}")
	public String deleteRow(@PathVariable("id") int id)
	{
		return tserv.deleteById(id)+" deleted";
	}
	
	//sorting ascending
		@GetMapping("/sortAsc/{name}")
		public List<User> sortasc(@PathVariable("name")String name)
		{
			  return tserv.sortByAsc(name);
		}
		//sorting descending
		@GetMapping("/sortDesc/{name}")
		public List<User> sortdsc(@PathVariable("name")String name)
		{
			  return tserv.sortByDsc(name);
		}

		//pagination
		@GetMapping("/pagination/{num}/{size}")
		public List<User> pagination(@PathVariable("num") int num,@PathVariable("size") int size){
			return tserv.pagination(num, size);
		}
		//pagination and sorting
		@GetMapping("/pagination/{num}/{size}/{name}")
		public List<User> paginationAndSorting(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String name){
			return tserv.paginationAndSorting(num, size,name);
		}

	}