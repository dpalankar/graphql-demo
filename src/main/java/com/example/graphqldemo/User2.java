package com.example.graphqldemo;
//package com.example.graphqldemo;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//
//import com.introproventures.graphql.jpa.query.annotation.GraphQLDescription;
//
//@Entity
//@GraphQLDescription("User representation of an entity")
//public class User {
//	@Id
////	 @GeneratedValue(strategy=GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
//	@SequenceGenerator(name = "book_generator", sequenceName = "book_seq",initialValue=1, allocationSize = 50)
////	@GeneratedValue(strategy = GenerationType.TABLE, generator = "book_generator")
////	@TableGenerator(name="book_generator", table="id_generator")
//	@GraphQLDescription("Primary Key for the Character Class")
//	private Long id;
//	@GraphQLDescription("Name of the User")
//	private String name;
//	@GraphQLDescription("email of the User")
//	private String email;
//	@GraphQLDescription("address of the User")
//	private String address;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
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
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//}
