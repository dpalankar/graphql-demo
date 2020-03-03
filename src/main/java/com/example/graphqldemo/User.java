package com.example.graphqldemo;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.introproventures.graphql.jpa.query.annotation.GraphQLDescription;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@GraphQLDescription("User representation of an entity")
public class User {
	@Id
	@GraphQLDescription("Primary Key for the Character Class")
	Integer id;

	@GraphQLDescription("Name of the character")
	String name;
	
	@GraphQLDescription("Name of the character")
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
