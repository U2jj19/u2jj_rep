package Tash;


//Task1 - Convert every word's last letter to upper case

public class Task_1 {
	
	public static void main(String[] args)
	{
		String str = "ujjwal kumar";
		System.out.println(last_letter_to_uppercase(str));
		
	}
	
	public static String last_letter_to_uppercase(String str)
	{
		String ar[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		int n = ar.length;
		for(int i = 0;i<n;i++)
		{
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		
		
		return sb.toString().trim();
		
	}
	
	

}
