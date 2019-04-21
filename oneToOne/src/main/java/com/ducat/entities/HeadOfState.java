package com.ducat.entities;

import javax.persistence.*;

//Owned entity class
@Entity
@Table(name="hos")
public class HeadOfState {

	//state
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title,name;
	
	
	
	public HeadOfState() {
		super();
		
	}
	public HeadOfState(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
