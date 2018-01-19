/*
 * Hello World test program
 * @author Sanford Johnston
 * @date January 19, 2018
 * CS 371-M01, Lab1
 * This program displays the text "Hello World"
 */

import java.lang.String;
import java.util.Scanner;

public class Hello_World {

	public static void main(String[] args) {
		// Initialize variables
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		System.out.println ("Hello World. What is your name?");
		input = scan.nextLine();
		System.out.println ("Pleasure to meet you " + input + ". Good bye!");

	} // end main

} // end class
