package com.google.clases;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// Class Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hi there, How's your name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt(); //Integer.parseInt( sc.nextLine() );
		
		System.out.println("How about your height?");
		float height = sc.nextFloat();
		
		sc.nextLine();
		System.out.println("Do you like this course? (yes/no)");
		Boolean valueBool = sc.nextLine().equals("yes");
		
		System.out.println("Hi "+name+" Your name is so Cool!!. Your age is "+ age + ". Your height is: "+ height+". Your response is: "+ valueBool);
		
		sc.close(); // Sirve para cerrar el monitoreo de la consola de la clase Scanner
	}
}