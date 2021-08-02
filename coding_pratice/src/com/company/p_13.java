package com.company;

import java.util.*;

public class p_13 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number -");
            int n = sc.nextInt();
            System.out.println("Enter the choice");
            int c = sc.nextInt();
            int sum =0;
            int mul =1,i;
            if(c == 1)
            {
                for(i=1;i<=n;i++)
                {
                    sum = sum+i;
                }
                System.out.println(sum);
            }
            else if (c == 2)
            {
                for(i=1;i<=n;i++)
                {
                    mul = mul * i;

                }
                System.out.println(mul);
            }
            else
            {
                System.out.println(-1);
            }






        }
        catch (Exception e)
        {

        }

    }
}
