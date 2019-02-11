public class procedure {

	public static void RollDie(int maxValue) {
		 
		//System.out.println("hi");
		 int random = (int)(Math.random() * maxValue + 1);
		 System.out.println(random);
	 }
	public static void main(String[] args) {
		
	RollDie (10000);
	
		 

	}

}

