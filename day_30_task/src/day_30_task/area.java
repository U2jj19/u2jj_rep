package day_30_task;

public class area extends length_breath_height {
	
  

	public static void rectangle(float length, float breath)
	{
		area = length * breath ;
		
	    System.out.println("Area of rectangle is - " + area);
		
		
	}
	
	public static void square(float side)
	{
		 System.out.println("Area of Square is - " + (side*side));
		
	}
	
	public static void trapezium(float length , float breath , float height)
	{
		System.out.println("Area of Trapezium is - " +  ((length +breath *height)/2));
		
	}
	
	
	
	
	
	
	

}
