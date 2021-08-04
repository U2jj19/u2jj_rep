package eg1;

import java.util.Scanner;

public class last_letter_upercase {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String ar[] = str.split(" ");
		for(int i = 0;i<ar.length;i++)
		{
			int j =ar[i].length();
			sb.append(ar[i].substring(0, j-1)).append(Character.toUpperCase(ar[i].charAt(j-1))).append(" ");
		}
		System.out.println(sb.toString());
	}

}
