package com.company;

import java.util.*;

public class p_15 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int rem = 0,rev = 0;
            int temp = n;


            while (n!=0)
            {

                rem = n%10;
                rev = rev*10+rem;
                n = n/10;


            }
            System.out.println(rev);
            if (temp == rev)
            {
                System.out.println("yes");
            }
            else
                System.out.println("no");

        }
        catch (Exception e)
        {

        }
    }
}
