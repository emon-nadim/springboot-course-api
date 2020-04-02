package com.nadimemon.springbootcourseapi.exception;

import org.springframework.http.HttpStatus;

public class Error {
	private String code;
	private String title;
	private String detail;
	private String link;
	
	public Error() {
		
	}
	public Error(String code, String title, String detail, String link) {
		super();
		this.link = link;
		this.code = code;
		this.title = title;
		this.detail = detail;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
