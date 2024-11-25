package com.example.common.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TodoInput {
	private int id;
	@NotBlank(message = "タイトルは必須です")
	private String title;
	@NotBlank(message = "説明は必須です")
	private String desc;
	
	public TodoInput(int id, String title,String desc) {
		super();
		this.id=id;
		this.title = title;
		this.desc = desc;
	}
	public TodoInput() {
	    // 必須のデフォルトコンストラクタ
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
