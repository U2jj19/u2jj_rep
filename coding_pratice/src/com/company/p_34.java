package com.company;

import java.util.*;

public class p_34 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            String str1 = str.toLowerCase();

            for (int i =0;i<str1.length();i++)
            {
                char c=str1.charAt(i);

                int n = (char) c;
                System.out.print(n-96);

            }


        }
        catch (Exception e)
        {
            System.out.println(e);

        }
    }
}
