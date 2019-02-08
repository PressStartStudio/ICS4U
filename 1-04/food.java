import java.util.Scanner;
public class food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String food = "";
		int amount = 0; 
		float time = 0;
		float total = 0;
		System.out.print("What food do you want? (pizza/sub/soup): ");	
		food = input.next();
		System.out.println(food);
		System.out.print("how much food are you going to put in 1,2 or 3");
		amount =  input.nextInt();
		System.out.println(amount);
		if (food.equals("sub")) {
			 time = (float) 1;
			 System.out.println(time);
		}
		else if (food.equals("pizza")) {
			time = (float) 0.45;
		}	
		else if (food.equals("sub")){
			time = (float) 1.75;
			
		}
		if (amount == (float)1) {
			total = time;
		}
		else if (amount == (float)2) {
			total = (float) (time * 1.50);
		}
		else if (amount == (float)3) {
			total = (float) (time * 2);
		}
		System.out.println(total);
		
	}
}

