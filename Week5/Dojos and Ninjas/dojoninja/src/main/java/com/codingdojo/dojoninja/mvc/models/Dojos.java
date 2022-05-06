package com.codingdojo.dojoninja.mvc.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
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
	@Size(min = 5, max = 200)
	private String name;
	
	// This will not allow the createdAt column to be updated after creation
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM--dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM--dd")
	private Date updatedAt;
	
	public Dojos() {
	}
	public Dojos(String name)
	{
		this.name = name;
	}
	
    // other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
