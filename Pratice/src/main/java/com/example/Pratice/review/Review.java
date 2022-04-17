package com.example.Pratice.review;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Review") 
@Table 
public class Review {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id",
            updatable = false  
    )
	private Long id;
	private String rev;
	
	public Review() {
		
	}
	public Review(Long id, String rev) {
		this.id = id;
		this.rev = rev;
	}
	
	
	
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRev() {
		return rev;
	}
	public void setRev(String rev) {
		this.rev = rev;
	}
	@Override
	    public String toString() {
	        return "Review{" +
	                "id=" + id +
	                "rev=" + rev +
	                '}';
	    }
}
