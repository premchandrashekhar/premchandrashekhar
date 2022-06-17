package com.test.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String title;

	@Column(length = 1000)
	private String description;

	@ManyToOne
	@JoinColumn(name = "application_id")
	private Application application;

	@ManyToOne
	@JoinColumn(name = "release_id")
	private Release release;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(Integer id, String title, String description, Application application, Release release) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.application = application;
		this.release = release;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Release getRelease() {
		return release;
	}

	public void setRelease(Release release) {
		this.release = release;
	}

}
