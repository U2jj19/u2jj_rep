package com.company;

import java.util.*;

public class p_9b {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); //5
            int i=1;
            while (i <= n)
            {
                int j=1;
                while (j<=n)
                {
                    System.out.print ("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        catch (Exception e) {


        }

    }
}
