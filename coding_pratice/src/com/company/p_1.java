package com.company;

import java.util.*;

public class p_1 {
    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==b && b==c && a==c)
            {
                System.out.println(1);

            }
            else if (a==b || b==c || a==c)
            {
                System.out.println(0);
            }

            else
            {
                System.out.println(-1);
            }

        }
        catch (Exception e)
        {

        }

    }
}
