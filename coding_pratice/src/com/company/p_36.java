package com.company;

import java.util.*;

public class p_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";


        for (int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int n = (char) ch+3;
            if(n>122)
            {
               n= n-26;
               char c = (char) n;
                System.out.print(c);

            }
            else
            {
                char c = (char) n;
                System.out.print(c);

            }







        }
    }
}
