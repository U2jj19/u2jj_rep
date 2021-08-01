package Eg1;

import java.util.Scanner;

public class Domain_Name_Exatracter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Url :- ");
		String str = sc.nextLine();
		domainExtracter(str);
		sc.close();

	}
	public static void domainExtracter(String str) {
		String str2[] = str.split("/");
		System.out.println("Domain Name Is: " +str2[2]);
	}	

}
