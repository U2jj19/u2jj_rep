package com.company;

import java.util.*;

public class p_9l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;

        while (i<=n)
        { int t=i;
            int j =1;
            while (j<=i)
            {
                System.out.print(t);
                t--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
