package eg1;

import java.util.Scanner;

public class middle_letter_uppercase_first_etter_uppercase {
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	String s = sc.nextLine();
	
	m_l_u_f_l_u(s);
	
	
	
		
	}
	public static StringBuilder m_l_u_f_l_u(String s) {
		StringBuilder sb = new StringBuilder();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if(str[i].length()%2!=0) {
				sb.append(str[i].substring(0, str[i].length()/2)).append(Character.toUpperCase(str[i].charAt(str[i].length()/2))).append(str[i].substring(str[i].length()/2+1)).append(" ");
			} else {
				sb.append(Character.toUpperCase(str[i].charAt(0))).append(str[i].substring(1)).append(" ");
			}
		}
		return sb;
	}
	

}
