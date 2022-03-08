package com;

public class Class1 {

	public static void printWelcomeScreen(String appName, String developerName) {
		String Details = String.format("\n"
				+ " %s \n" + " %s\n"
				+ "\n", appName, developerName);
	
		System.out.println(Details);
	}

	public static void displayMenu() {
		String menu = "\n Select any option number from below and press Enter\n"
				+ "1) Retrieve all files inside \"Main\" folder\n" + "2) Add,Delete,Search a user specified file to the application\n"
				+ "3) Exit\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\nSelect any option number from below and press Enter \n"
				+ "1) Add a file to \"Main\" folder\n" + "2) Delete a file from \"Main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit \n";

		System.out.println(fileMenu);
	}

}