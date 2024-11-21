package com.example.common;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class todo {
	@Id
	private Integer id;
	private String title;
	private String desc;
	public todo() {}
	public todo(Integer id, String title, String desc) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "todo [id=" + id + ", title=" + title + ", desc=" + desc + "]";
	}

	

}
