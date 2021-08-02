package com.company;

import java.util.*;

public class p_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[ n ];
        int i,j = 0;
        int max = arr[0];
        for (i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }


            if (arr[i] == max)
            {
                j = i;
            }

        }


        System.out.println(max);
        System.out.println(j);

    }
}
