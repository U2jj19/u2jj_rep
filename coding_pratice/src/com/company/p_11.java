package com.company;

import java.util.*;

public class p_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c>='A' && c<='Z')
            System.out.println(1);
        else if (c>='a' && c<='z')
            System.out.println(0);
        else
            System.out.println(-1);
        System.out.println(c);
    }
}
