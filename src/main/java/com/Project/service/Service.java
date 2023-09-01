package com.Project.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.Project.model.User;
import com.Project.repository.UserRepository;


@org.springframework.stereotype.Service
public class Service {
	@Autowired
	public UserRepository trepo;
	
	//post data
	public String postData(User t)
	{
		trepo.save(t);
		return "Your data is saved successfully";
	}
	//getdata
	public List<User> getData()
	{
		return trepo.findAll();
	}
	public List<User> getbyname(String name)
	{
		return trepo.getAllRows(name);
	}
//	public List<User> getDataByChar(String name)
//	{
//		return trepo.getByname(name);
//	}
	//delete the data
	public int deleteById(int id)
	{
		return trepo.deleteId(id);
	}

	public User getUserData(int id) {
	return trepo.getUserData(id);
	}
	public List<User> sortByAsc(String name)
	{
		return trepo.findAll(Sort.by(name).ascending());
	}
	public List<User> sortByDsc(String name)
	{
		return trepo.findAll(Sort.by(name).descending());
	}

	//pagination
	public List<User> pagination(int pageNu,int pageSize)
	{
		Page<User> cont= trepo.findAll(PageRequest.of(pageNu, pageSize));
		return cont.getContent();
	}
	//sorting
	public List<User> paginationAndSorting(int pagNu,int pageSize,String name)
	{
		Page<User> cont1=trepo.findAll(PageRequest.of(pagNu, pageSize,Sort.by(name)));
		return cont1.getContent();
	}
	public User save(User t) {
		// TODO Auto-generated method stub
		return trepo.save(t);
	}

}