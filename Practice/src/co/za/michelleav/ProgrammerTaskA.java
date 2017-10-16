package co.za.michelleav;

/*
 * Created by michelleav on 16/10/17
 */

public class ProgrammerTaskA {

		public static int getCountOfOnes(int n) {
			int a = 0;
			int count = 0;
			while(n > 0) {
				//Obtain the modules of 2
				a = n % 2;
				if(a == 1) {
					//If the value is 1 increment count variable
					count++;
				}
				n = n / 2;
			}
			return count;
		}
		
		public static void main(String [] args) {
			int number1 = 11;
			System.out.println("Binary of "+number1+" is :"+getCountOfOnes(number1));
			int number2 = 46;
			System.out.println("Binary of "+number2+" is :"+getCountOfOnes(number2));
			int number3 = 63;
			System.out.println("Binary of "+number3+" is :"+getCountOfOnes(number3));
		}
		
}
