package com.company;

import java.util.*;

public class p_9i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int t=i;
        while(i<=n)
        {
            int j = 1;

            while (j <= i)
            {

                System.out.print(t+" ");
                t++;

                j++;
            }
            System.out.println();
            i++;
        }
    }
}
