package com.Crud.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.Crud.model.Student;
@Transactional
@Repository
public class DataObj implements Dao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public int SaveStudent(Student stud) 
	{

		Integer num=(Integer)this.hibernateTemplate.save(stud);
			System.out.println(stud);
				return num;
	}

}
