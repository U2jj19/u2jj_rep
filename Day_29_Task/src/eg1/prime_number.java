package eg1;

public class prime_number {
	
	public static void main(String[] args) {
	
		int[] arr = {23,13,5,7,9,3,17,97,46,63};
		find_prime_number(arr);
	}
	
	public static void find_prime_number(int []arr)
	{
		int i,j;
		for( i = 0;i<arr.length;i++)
		{
			int flag =0;
			for(j=2;j<arr[i];j++)
			{
				
				if(arr[i] % j == 0)
				{
					flag = 1;
					break;
					
				}
				
			}
			if(flag == 0)
			{
				System.out.println(arr[i] +" is prime number");
			}
			
			
		}
		
	}

}
