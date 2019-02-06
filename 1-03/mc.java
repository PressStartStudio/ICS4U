import java.util.Scanner;
import java.lang.Math;
public class mc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float mass = 0;
		float result1 = 0;
		float result = 0;
		float speed = (float) (8.988E16);
		System.out.println(speed);
		System.out.print("Enter the mass: ");
		mass = input.nextFloat();
		//result1 = (float) Math.pow(speed,2);
		//System.out.println(result1);
		result = (float) (mass * speed);
		
		System.out.println("\n The energy output is" + result + " joules.");		
	}

}

