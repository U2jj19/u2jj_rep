package com.company;

import java.lang.reflect.*;
import java.util.*;

public class p_23 {

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }


    }
    public static void unique(int arr[],int n)
    {
        int temp = 0;
        int i;
        bubbleSort(arr);



        for (i=0;i<arr.length;i++)
        {
            int j;
            for (j=i+1;j<arr.length-1;j++)
            {
                if (arr[i]!= arr[j])
                {
                    temp =arr[j];


                }
            }

        }
        System.out.println(temp);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        int i;
        for(i = 0;i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        unique(arr,n);






















    }
}
