package eg1;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(ispalindrome(str));

	}
	public static boolean ispalindrome(String s)
	{
		return new StringBuilder(s).reverse().toString().equals(s);
		
	}
	
	
}
