package com.company;

import java.util.*;

public class p_2 {
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum=0;

            for(int i = 1 ; i <= n ; i++ )
            {
                if(i % 2 == 0)
                {
                  sum = sum + i ;
                }

            }
            System.out.println(sum);

        }
        catch (Exception e)
        {

        }

    }
}
