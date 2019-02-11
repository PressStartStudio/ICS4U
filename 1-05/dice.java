import java.util.Random;
import java.util.Scanner;

public class dice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int amount = 0;
        int score = 0;
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random() * 10 + 1);
        System.out.print("what number do you think the dice rolled");
        amount =  input.nextInt();
        
        while (amount != random) {
            //int random = (int)(Math.random() * 50 + 1);
        	score = score + 1;
            System.out.println("sorry your worng guess again also +1 got added to your score were playing golf rules");
            amount =  input.nextInt();
            
            
        }
         System.out.print("you wright the answer is " + random + " you score is ");
         System.out.println(score);
    }

}
