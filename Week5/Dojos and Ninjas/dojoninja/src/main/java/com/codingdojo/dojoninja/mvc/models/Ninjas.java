package com.codingdojo.dojoninja.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class Ninjas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 1, max = 200)
	private String firstName;
	@NotNull
	@Size(min = 1, max = 200)
	private String lastName;
	@NotNull
	@Min(1)
	private int age;
	
	// This will not allow the createdAt column to be updated after creation
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM--dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM--dd")
	private Date updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dojos_id")
	private Dojos dojos;
	
	//Constructors
	public Ninjas ()
	{
		
	}
	
	public Ninjas(String firstName, String lastName, int age, Date createdAt, Date updatedAt, Dojos dojos)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.dojos = dojos;
	}
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    //Getters and Setters
    public String getFirstName()
    {
    	return firstName;
    }
    public String getLastName()
    {
    	return lastName;
    }
    public int getAge()
    {
    	return age;
    }
    public Date getCreated() 
    {
    	return createdAt;
    }
    public Date getUpdated()
    {
    	return updatedAt;
    }
    public Dojos getDojos()
    {
    	return dojos;
    }
    public void setFirstName(String firstName)
    {
    	this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
    	this.lastName = lastName;
    }
    public void setAge(int age)
    {
    	this.age = age;
    }
    public void setCreated(Date createdAt)
    {
    	this.createdAt = createdAt;
    }
    public void setUpdated(Date updatedAt)
    {
    	this.updatedAt = updatedAt;
    }
    public void setDojo(Dojos dojos)
    {
    	this.dojos = dojos;
    }
}
