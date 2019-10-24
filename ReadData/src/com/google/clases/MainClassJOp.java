package com.google.clases;

import javax.swing.JOptionPane;

public class MainClassJOp{
	
	public static void main(String[] args) {		
		String name = JOptionPane.showInputDialog(null, "What's your name?");
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));
		
		String finalMessage = "Hey! "+name+" your name is so cool!!!. Your age is "+age;
		
		JOptionPane.showMessageDialog(null, finalMessage);
	}
}