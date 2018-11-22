
//package com.test.entities;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
///**
// * @author Liviu
// *
// */
//@Entity
//@Table(name="persoana")
//public class Persoana {
//
//	@Id
//	@Column(name="cnp" ,  length = 13)
//	private String cnp;
//
//	@Column(name="nume")
//	private String name;
//
//	@Column(name="prenume")
//	private String surname;
//
//	@Column(name="varsta")
//	private int age;
//
////	@OneToMany
////	@JoinColumn(name = "cnp_posesor", referencedColumnName = "cnp", insertable = false, updatable = false)
////	private List<Masina> p;
//
//	public String getCnp() {
//		return cnp;
//	}
//
//	public void setCnp(String cnp) {
//		this.cnp = cnp;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSurname() {
//		return surname;
//	}
//
//	public void setSurname(String surname) {
//		this.surname = surname;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//}