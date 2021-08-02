package com.company;

import java.lang.reflect.*;
import java.util.*;

public class p_25 {
    public static void intersection(int arr1[],int arr2[],int m, int n)

    {
        int i=0,j=0;
        while (i<n && j<n)
        {
            if (arr1[i]>arr2[j])
            {
                j++;
            }
            else if(arr2[j]>arr1[i])
            {
                i++;
            }
            else
            {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("element 1");
        int n = sc.nextInt();

        System.out.println("arr1");
        int arr1[] = new int[n];

        for (int i =0;i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();

        }

        System.out.println("element 2");
        int m = sc.nextInt();
        System.out.println("arr2");
        int arr2[] = new int[m];




        for (int i =0;i<arr2.length;i++)
        {
            arr2[i] = sc.nextInt();

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        intersection(arr1,arr2,m,n);




    }
}
