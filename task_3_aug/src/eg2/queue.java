package eg2;


import java.util.*;

public class queue {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		Queue<Integer> a = new LinkedList<Integer>();
		
        System.out.println("ENTER THE NUMBER - ");
        
        int n = sc.nextInt();

        for(int i = 0;i<n;i++)
        {

            int num = sc.nextInt();

            a.add(num);


        }
		
		

		

		for (Integer i : a) {
			System.out.println(i);
		}

		
		a.remove();
		System.out.println("AFTER DELETION OF ELEMENTS -");
		for (Integer i : a) {
			System.out.println(i);
		}

		

	}


}
