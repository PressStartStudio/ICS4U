public class array {
 
	public static void main(String[] args) {
		
		 int[][] marks = new int [4][6];
		 int total = 0;
		 for(int i = 0; i < marks.length; i++) {// this is the students
			 for(int j = 0; j < marks[0].length; j++) { // this line is the assin
				 marks[i][j] = (int)(Math.random() * 99 + 1);
				 total += marks[i][j]; // += means add then reasign
			 }
		 } 
		 System.out.print(total/24);
		 
		 
		
		 
		 
		}
	}

