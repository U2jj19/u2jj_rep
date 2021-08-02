package com.company;

import java.util.*;

public class p_6 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int rem=0,even_sum=0,odd_sum=0,sum_e=0,sum_o=0;
            while(n>0)
            {
                rem = n%10;
                if(rem%2==0)
                {
                     even_sum = rem;
                     sum_e = sum_e + even_sum;


                }
                else
                {
                    odd_sum = rem;
                    sum_o = sum_o + rem;


                }
                n = n/10;

            }
            System.out.println("even sum is" +" "+ sum_e );
            System.out.println("odd sum is"+" "+sum_o);



        }
        catch (Exception e)
        {
            System.out.println("error");

        }
    }
}
