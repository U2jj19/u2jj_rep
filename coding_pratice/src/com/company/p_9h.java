package com.company;

import java.util.*;

public class p_9h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int t=1;
        while(i<=n)
        {
            int j =1;

            while (j<=i)
            {

                System.out.print(t);
                t++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
