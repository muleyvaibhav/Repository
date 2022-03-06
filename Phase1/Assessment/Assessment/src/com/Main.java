package com;

public class Main {

	public static void main(String[] args) {
		
		FileHandling.createMainFolderIfNotPresent("Main");
		
		Class1.printWelcomeScreen("Welcome to The Application", "Hai,I'm Vaibhav");
		
		Class.handleWelcomeScreenInput();
	}

	
}