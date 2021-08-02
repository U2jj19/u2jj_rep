package com.company;

import java.util.*;

public class p_8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();  // number
            int x = sc.nextInt();    // power
            //int i = x;


            int result = 1;
            while(x!=0)
            {
                result = result * n;
                --x;



            }
            System.out.println(result);

        }

        catch (Exception e)
        {

        }
    }
}
