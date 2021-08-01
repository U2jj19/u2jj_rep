package eg1;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(ispalindrome_in_details("MAM"));
		

	}
	
	public static boolean ispalindrome(String s)
	{
		return new StringBuilder(s).reverse().toString().equals(s);
		
	}
	
	public static boolean ispalindrome_in_details(String s)
	{
		StringBuilder sb1 = new StringBuilder(s);
		sb1.reverse();
		String str = s.toString();
		return str.equals(sb1);
		
		
	}

}
