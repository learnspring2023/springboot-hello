package com.example.demospringboot;

public class College {

	private String collageName;
	private String city;
	public College(String collageName, String city) {
		super();
		this.collageName = collageName;
		this.city = city;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Collage [collageName=" + collageName + ", city=" + city + "]";
	}
	
}
