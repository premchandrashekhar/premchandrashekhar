package com.test.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Release {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "release_id")
	private Integer id;

	private String releaseDate;

	@Column(length = 1000)
	private String description;

	public Release() {
		super();
	}

	public Release(Integer id, String releaseDate, String description) {
		super();
		this.id = id;
		this.releaseDate = releaseDate;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
