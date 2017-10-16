package co.za.michelleav;

/*
 * Created by michelleav on 16/10/17
 */

public class ProgrammerTaskB {
	
	public static boolean isPalindrome(String s) {
		//If string length is 0 or 1 then its a palindrome and don't process further
		if(s.length() == 0 || s.length() == 1) {
			return true;
		} else if(s.charAt(0) == s.charAt(s.length()-1)) {
			//Check first char and last char matches if they do call method again with a substring of s
			return isPalindrome(s.substring(1, s.length()-1));
		}
		//If none of the above is true then it's not a palindrome
		return false;
	}
	
	public static void main(String [] args) {
		String test1 = "abcba";
		System.out.println("Test 1 Palindrome = "+isPalindrome(test1));
		String test2 = "aadbrbbaa";
		System.out.println("Test 2 Palindrome = "+isPalindrome(test2));
		String test3 = "cocoococ";
		System.out.println("Test 3 Palindrome = "+isPalindrome(test3));
	}
}
