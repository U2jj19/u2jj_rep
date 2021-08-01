package Eg1;

import java.util.*;

public class Web_Security {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Url : ");
		String str = sc.nextLine();
		isWebsiteSecured(str);
		sc.close();
	}
	
	public static void isWebsiteSecured(String str) {
		if(str.startsWith("https")) {
			System.out.println("Website is secured");
		} else {
			System.out.println("Website is not secured");
		}
	
	}

}
