package com.company;

import java.util.*;

public class p_26 {
    public static void sort01(int arr[],int n)
    {
        for (int i =0;i<n-1;i++)
        {
            for(int j =0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }
    public static void print(int arr[],int n)
    {
        sort01(arr, n);

        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }


    }

    public static void main(String[] args) {
        int n;
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {


            n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        print(arr,n);






    }
}
