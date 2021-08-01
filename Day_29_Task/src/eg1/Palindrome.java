package eg1;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(ispalindrome("MAM"));

	}
	public static boolean ispalindrome(String s)
	{
		return new StringBuilder(s).reverse().toString().equals(s);
		
	}
	
	
}
