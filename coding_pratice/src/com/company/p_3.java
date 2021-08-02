package com.company;

import java.util.*;

public class p_3 {
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int gcd=0;

            for(int i = 1; i<=n && i<=m; i++)
            {
                if(n%i == 0 && m %i == 0)
                {
                    gcd = i;

                }
            }
            System.out.println(gcd);


        }

        catch (Exception e)
        {

        }
    }
}
