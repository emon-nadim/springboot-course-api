package com.nadimemon.springbootcourseapi.exception;

public class ErrorSource {
	private String pointer;
	private String parameter;
	
	public ErrorSource() {
		
	}
	public ErrorSource(String pointer, String parameter) {
		super();
		this.pointer = pointer;
		this.parameter = parameter;
	}
	
	public String getPointer() {
		return pointer;
	}
	public void setPointer(String pointer) {
		this.pointer = pointer;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	
}
