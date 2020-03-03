package com.example.graphqldemo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.introproventures.graphql.jpa.query.annotation.GraphQLDescription;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="customer")
//@Getter
//@Setter
//@ToString
@GraphQLDescription("Customer representation of an entity")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GraphQLDescription("Primary Key for Customer")
	private Integer id;
	
	@Column(unique = true, nullable = false)
	@GraphQLDescription("email of the Customer")
	private String email;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}