package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Name", nullable = false)
	private String Name;
	
	@Column(name = "Department")
	private String Department;
	
	@Column(name = "Country")
	private String Country;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, String email) {
		super();
		this.Name = Name;
		this.Department = Department;
		this.Country = Country;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return  Name;
	}
	public void setName(String  Name) {
		this.Name = Name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String email) {
		this.Country = Country;
	}
}