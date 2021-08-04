package eg1;

public class thread1 extends thread 
{
	public void run()
	{
		int i;
		for(i = 0;i<5;i++)
		{
			System.out.println("Thread no - " + i);
			try
			{ 
				
				Thread.sleep(1000); 
			}
			catch (Exception e)
			{
					
			};
				
			}
		}
	
	

}
