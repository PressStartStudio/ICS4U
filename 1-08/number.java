import java.util.Scanner;
import java.util.Random;
public class number {
    static final int maxamountforstring = 100000; 
    static char gettingmax(String userinput) 
    { 
        // Create array to keep the count of individual 
        // characters and initialize the array as 0 
        int count[] = new int[maxamountforstring]; 
       
        // this is where the computer starts to count the chariters that the user inputed in to the 
        // array 
         
        int length = userinput.length(); 
        for (int i=0; i<length; i++)   //this is where the computer sees if there is any reocuring leters and if so add's a number to that letter
            count[userinput.charAt(i)]++; 
       
        int max = -1;  // Starts the count 
        char answer = ' ';   // Starts to collect the  answer 
       
       
        // this is where the magic begins
        // this is where the computer starts to count the number and add the number from the input
        for (int i = 0; i < length; i++) { 
            if (max < count[userinput.charAt(i)]) {  // once there is a reocuing letter this is where it will check to see what that letter is
                max = count[userinput.charAt(i)]; 
                answer = userinput.charAt(i); 
            } 
        } 
        System.out.print("the number of the most orcuring chariter is ");
        System.out.println(max); // this is printing out the how many of the biggest chariter there is
        return answer; 
        
    } 
      
     
    public static void main(String[] args) 
    { 
    	// user inputs his string
    	int random = (int)(Math.random() * 10 + 1);
    	Scanner input = new Scanner(System.in);
    	System.out.print("please say somthing- ");
    	String userinput = input.next();
        System.out.println("the most occurring character(letter or number) is " + // this is where the computer outputs the answer
                            gettingmax(userinput)); 
        
        System.out.println("big thanks to //https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/");
    } 
    

}

