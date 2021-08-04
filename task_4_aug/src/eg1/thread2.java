package eg1;

public class thread2 extends thread{
	
	public void run()
    {
        for(int i=0;i<=5;i++)
        {
            int sum=0;
            sum = sum+i;
            System.out.println(sum);
            try{ Thread.sleep(1000); }catch (Exception e){};
        }
    }
	

}
