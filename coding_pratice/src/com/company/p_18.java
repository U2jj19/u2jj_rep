package com.company;

import java.util.*;

public class p_18 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int temp;

            for(int i = 0;i<n/2;i++)
            {
                if(i*i == n)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.println(Math.sqrt(n));
                    break;

                }
            }
        }
        catch (Exception e)
        {

        }
    }
}
