package com.company;

import java.util.*;

public class p_9A {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i =1;i<=n;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print(j + "");


                }
                System.out.println();
            }
        }

        catch (Exception e)
        {
//            1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5
//            1 2 3 4 5 6
//            1 2 3 4 5 6 7
        }
    }
}
