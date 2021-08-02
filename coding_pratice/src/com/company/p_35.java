package com.company;

import java.util.*;

public class p_35 {
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr [] = new String[n];
        int i;
        for ( i =0; i<arr.length;i++)
        {
            arr[i] = sc.next();
        }
        String rev = "";

        //Collections.reverse(Arrays.asList(arr));
        for (i = arr.length-1;i>=0;i--)
        {
            rev = rev + arr[i];



        }
        System.out.println(rev);

    }
}
