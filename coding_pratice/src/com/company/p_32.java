package com.company;

import java.util.*;

public class p_32 {

    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of element");
            int n = sc.nextInt();
            System.out.println("enter the number");
            int a[] = new int[n];
            int i;


            for( i = 0;i<n;i++)
            {
                a[i] = sc.nextInt();

            }
            System.out.println("enter the index to be search ");
            int v= sc.nextInt();
            System.out.println(a[v-1]);

        }
        catch (Exception e)
        {
            System.out.println(e);

        }



    }
}
