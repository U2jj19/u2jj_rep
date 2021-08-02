package com.company;

import java.util.*;

public class p_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();

        }


        Collections.reverse(Arrays.asList(arr1));
        //Arrays.asList(arr2);
//        int result =0,sum=0;
//        for (int i=0;i<n;i++)
//        {
//            result =  arr1[i]*arr2[i];
//            sum = sum+result;
//        }
//        System.out.println(sum);


    }
}
