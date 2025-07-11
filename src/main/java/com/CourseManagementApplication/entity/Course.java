package com.CourseManagementApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

@Entity
public class Course {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
	@Size(min =3,max = 20)
    private String title;
	@Size(min =3,max = 20)
    private String description;
	@Size(min =3,max = 20)
    private int duration;
	
	@Email
	private String Email;

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", Email=" + Email + "]";
	}

	public Course(Long id, @NotBlank @Size(min = 3, max = 20) String title, @Size(min = 3, max = 20) String description,
			@Size(min = 3, max = 20) int duration, @jakarta.validation.constraints.Email String email) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.Email = email;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
