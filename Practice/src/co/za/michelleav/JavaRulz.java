package co.za.michelleav;
/*
 * Created by michelleav on 16/10/17
 */

public class JavaRulz {
	
	public static void main (String [] args) {
		int maxNum = 100;
		for(int i = 1; i <= maxNum; i++) {
			if(((i % 5) == 0) && ((i % 3) == 0)) {
				System.out.println("JavaRulz");
			} else if((i % 5) == 0) {
				System.out.println("Rulz");
			} else if((i % 3) == 0) {
				System.out.println("Java");
			} else {
				System.out.println(i);
			}
		}
	}

}
