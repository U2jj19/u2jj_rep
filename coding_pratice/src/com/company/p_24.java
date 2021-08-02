package com.company;

import java.util.*;

public class p_24 {

    public static void find_duplicate(int arr[],int n)
    {
        int temp=0;
        for(int i =0;i < arr.length;i++)
        {
            for (int j = i+1;j<arr.length;j++)
            if(arr[i] == arr[j])  // 5,6,7,5,8
            {
                System.out.println(arr[j]);

            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        find_duplicate(arr,n);

    }
}
