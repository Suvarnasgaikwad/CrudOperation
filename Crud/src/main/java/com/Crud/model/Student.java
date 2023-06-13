package com.Crud.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student 
{       
	    @Id 
	    private int Id;
		private String name;
		private String ClgName;
		private String sub;
		
		public String getSub() {
			return sub;
		}
		public void setSub(String sub) {
			this.sub = sub;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getClgName() {
			return ClgName;
		}
		public void setClgName(String clgName) {
			ClgName = clgName;
		}
		@Override
		public String toString() {
			return "Student [Id=" + Id + ", name=" + name + ", ClgName=" + ClgName + ", sub=" + sub + "]";
		}
		
		
	
}
