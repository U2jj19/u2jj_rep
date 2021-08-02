package com.company;

import java.util.*;

public class p_17 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            int e = sc.nextInt();
            int w = sc.nextInt();
            int result = 0;

            for(int i = s; i <= e ; i=i+w)

            {
                result = (i-32)*5/9;
                System.out.println(result);

            }



        }
        catch (Exception e)
        {

        }
    }
}
