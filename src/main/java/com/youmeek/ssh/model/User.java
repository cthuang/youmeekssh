package com.youmeek.ssh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by judasn on 2014/4/3.
 */
@Entity
@Table(name = "USER", schema = "")
public class User implements java.io.Serializable {
	private String id;
	private String name;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public User() {
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 36)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//@Column(name = "NAME", unique = true, nullable = false, length = 100)
	@Column(name = "NAME", length = 100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
