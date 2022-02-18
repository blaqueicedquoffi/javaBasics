package com.syntax.class06;

import java.util.Scanner;

public class Get_Instructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String instructor = "Asghar";
		Scanner getInstructor = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		instructor = getInstructor.nextLine();

		String subject;
		switch (instructor) {
		case "Asghar":
			subject = "Will take care of Java assignment";
			break;
		case "Moazzam":
			subject = "Will take care of SDLC Assignment";
			break;
		case "Weqas":
			subject = "Will take care of Selenium Assignment";
			break;
		case "Asel":
			subject = "Will take care of every Assignment";
			break;
		default:
			instructor = "Unknown";
			subject = "Invalid instructor selected";

		}

		System.out.println(subject);

	}

}
