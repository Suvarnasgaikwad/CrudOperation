package com.Crud.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.dao.Dao;
import com.Crud.model.Student;

@Service
public class Main implements StudService
{  
	@Autowired
	private Dao obj;
	
public int createStudent(Student stud)
  {
	  return  obj.SaveStudent(stud);
	
	  
  }

}
