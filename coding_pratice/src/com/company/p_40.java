package com.company;

import java.util.*;

public class p_40 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];


        int i,count=0,j,temp,min,min_index;
        for (i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            min=arr[i];
            min_index=i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    min_index=j;
                }
            }
            if(min_index!=i)
            {
                count++;
                temp=arr[min_index];
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(count);

    }
}
