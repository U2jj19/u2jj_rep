package com.company;

import java.util.*;

public class p_28 {
    public static void random(int n)
    {

        int[] list = new int[n];
        for (int i=0; i<n; i++)
        {
            int t = (int)(Math.random()*9 + 1);
            list[i] = t;

            System.out.println(list[i] + " ");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        random(n);
    }
}
