package com.Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Crud.Service.StudService;
import com.Crud.model.Student;

@Controller
public class FirstController 

{      
	   @Autowired
	   private StudService main;
	  
	@RequestMapping(path="/reg.sp")
       public String Display(@ModelAttribute Student stud,Model model)
       {
	      System.out.println(stud);
	     main.createStudent(stud);
		return "Display";
    	   
       }
}
