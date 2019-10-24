package com.google.courses;

public class JavaCourse {
	
	private final String title;
	
	public JavaCourse() {
		this.title = "Welcome to the Java Course";
	}
	
	// En vez de que el metodo sea public al ser protected las clases que quieran instanciar el metodo deben estar incluidas dentro del mismo paquete
	public String getTitle() { 
		return this.title;
	}	
}
