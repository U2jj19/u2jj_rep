package com.company;

import java.util.*;

public class p_27 {
    public static void array_sum(int arr[], int sum,int n)
    {
        sum=0;
        for (int i =0;i<arr.length;i++)
        {
            sum = sum +arr[i];
        }
        System.out.println(sum);


    }
//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int arr[]=new int[n];
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        array_sum(arr,sum,n);
    }


}
