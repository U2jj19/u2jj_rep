package com.company;

import java.util.*;

public class p_9q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =n;



        while(i>=1)
        {
            int t =i;
            int j = i;
            while(j<=n)
            {
                char c =(char) ('A'+j-1);
                System.out.print(c);
                t++;
                j++;


            }
            System.out.println();
            i--;
        }
    }
}
