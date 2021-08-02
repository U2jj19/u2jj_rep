package com.company;

import java.util.*;

public class p_9o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int i =1;
        while(i<=n)
        {
            int j =1;
            while (j<=i)
            {
                char c = (char) ('A'+i-1);
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
