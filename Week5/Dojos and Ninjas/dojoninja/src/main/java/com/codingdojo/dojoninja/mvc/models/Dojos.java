package com.codingdojo.dojoninja.mvc.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dojos")
public class Dojos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min = 2, max = 200)
	private String name;
	
	// This will not allow the createdAt column to be updated after creation
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM--dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM--dd")
	private Date updatedAt;
	
	@OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)
	private List<Ninjas> ninjas;
	
	//Constructors 
	public Dojos() {
	}
	public Dojos(String name, Date createdAt, Date updatedAt, List<Ninjas> ninjas)
	{
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.ninjas = ninjas;
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
    public Long getId()
    {
    	return id;
    }
    public String getName()
    {
    	return name;
    }
    public Date getCreated() 
    {
    	return createdAt;
    }
    public Date getUpdated()
    {
    	return updatedAt;
    }
    public List<Ninjas> getNinjas()
    {
    	return ninjas;
    }
    public void setId(Long id)
    {
    	this.id = id;
    }
    public void setName(String name)
    {
    	this.name = name;
    }
    public void setCreated(Date createdAt)
    {
    	this.createdAt = createdAt;
    }
    public void setUpdated(Date updatedAt)
    {
    	this.updatedAt = updatedAt;
    }
    public void setNinjas(List<Ninjas> ninjas)
    {
    	this.ninjas = ninjas;
    }
}
