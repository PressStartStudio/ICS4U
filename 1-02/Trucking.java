/**********************************************************************************************
 * 
 * Created by: Luca Ienzi
 * Modified by: Luca Ienzi
 * Created on: February 4, 2019
 * Last Modified on: February 4, 2019
 * 
 * This program calculates the number of logs that will fit on a truck if you know their length
 *
 */

import java.util.Scanner;

public class Trucking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float length = 0;
		float result = 0;
		System.out.print("Enter the maple log length in meters: ");
		length = input.nextFloat();
		result = 1100/(length * 20);
		System.out.println("\nThe truck can take " + result + " logs.");
	}
}

