package com.company;

import java.util.*;

public class p_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1 && n==2)
        {
            System.out.println(1);
        }
        else
        {
            int x  = ((n-1)+(n-2));
            System.out.println(x);
        }

    }
}
