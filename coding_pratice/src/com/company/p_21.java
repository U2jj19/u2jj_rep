package com.company;

import java.util.*;

public class p_21 {
    public static void f_to_c(int s, int e,int w)
    {
        int ans =0;
        for(int i = s ; i <= e; i = i + w)
        {
            ans = (i-32)*5/9;
            System.out.println(ans);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        f_to_c(s,e,w);
    }
}
