package com.company;

import java.util.*;

public class p_30 {
    public static void swap_alt(int arr[],int n)
    {
        int i;

        for(i =0;i<n-1;i+=2)
        {
            int temp =arr[i];
            arr[i] = arr[i+1];
            arr[i+1]= temp;




        }

        for(i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }









    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();
        int arr[] = new int [n];
        for (int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        swap_alt(arr,n);
    }
}
