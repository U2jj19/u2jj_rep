package com.company;

import java.util.*;

public class p_5 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sec = sc.nextInt();
            int n1=0,n2=1,n3,fib=0;
            System.out.print(n1 +" "+ n2+" ");

            for(int i = 0 ; i<n;i++)
            {
                n3= n1+n2;
                fib = n3;
                System.out.print(" "+ fib);

                //System.out.print(n3 +" ");
                System.out.println();
                n1=n2;
                n2=n3;


            }
            if(fib == sec)
                System.out.println("yes");
            else
                System.out.println("no");


        }
        catch (Exception e)
        {

        }
    }
}
