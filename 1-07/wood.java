import java.util.Scanner;
public class wood {

	
	public static void Board(float userl,float userw) {
		//float lenght = 12;
		//float width = 12;
		
		//int maxwidth = width * userw;
		//int maxlenght = lenght * userl;
		float hight = (userl * userw)/144;
		
		System.out.print("the hight is " + hight);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//String userw = null;
		System.out.print("input you lenght and with but be in mind a normal bord is 12 by 12 ");
		float userl = input.nextInt();
		float userw = input.nextInt();
		Board( userl, userw);

		
	}

}

