package com.company;

import java.util.*;

public class p_31 {
    public static void push_zero(int arr[],int n)
    {

        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                arr[count++] = arr[i];

            }
            while(count<n)
            {
                arr[count++] = 0;
            }



        }




    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        push_zero(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
