package com.awazpact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.awazpact.entity.Department;

@Entity
@Table(name = "emp_tbl_awz")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private String email;
	private String gender;
	@ManyToOne
	@JoinColumn(name = "dept_id")	
	@Cascade(CascadeType.ALL)
	private Department dept;
	@ManyToOne
	@JoinColumn(name = "cityId")
	@Cascade(CascadeType.ALL)
	private City city;
	
	@OneToOne
	@JoinColumn(name="accId")
	@Cascade(CascadeType.ALL)
	private AccountDetail accDetail;
	
	
	public Employee(int empId, String name, String email, String gender, Department dept, City city,AccountDetail accDetail) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dept = dept;
		this.city = city;
		this.accDetail = accDetail;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	public AccountDetail getAccountDetail() {
		return accDetail;
	}
	public void setAccountDetail(AccountDetail accDetail) {
		this.accDetail = accDetail;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", gender=" + gender + ", dept=" + dept + ", city=" + city + ",accDetail=" + accDetail+ "]";
	}

	

}
