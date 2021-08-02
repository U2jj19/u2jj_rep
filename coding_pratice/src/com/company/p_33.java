package com.company;

import java.util.*;

public class p_33 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            char c = sc.next().charAt(0);
            int count=0;
            int n = str.length();
            String str1 =str;
            for (int i =0;i<n;i++)
            {
                if(str.charAt(i)==c)
                {
                    count++;
                }
            }
            System.out.println(count);
            //System.out.println(str.split(" ",str.toUpperCase(str.charAt(0))));



        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
