package com.company;

import java.util.*;

public class p_16 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int rem=0 ,q=0, dec=0;
            int i =0;
            while(n>0)
            {

                rem = n%10;
                int power = (int) Math.pow(2,i);
                dec = dec + rem * power;
                i++;
                n = n/10;



            }
            System.out.println(dec);



        }
        catch (Exception e)
        {

        }

    }

}
