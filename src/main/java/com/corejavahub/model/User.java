package com.corejavahub.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "User_Micro")
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@jakarta.persistence.Id
	@Column(name = "ID")
	private String Id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ABOUT")
	private String about;
}
