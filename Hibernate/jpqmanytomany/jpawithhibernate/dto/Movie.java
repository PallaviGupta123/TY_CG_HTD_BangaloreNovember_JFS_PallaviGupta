package com.capgemini.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_info")
public class Movie {
	@Id
	@Column
	private int movie_id;
	@Column(name="movie_name")
	private String mname;
	@Column
	private String rating;
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMname() {
		return mname;
	}
	public void setMovie_name(String mname) {
		this.mname = mname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	

}
