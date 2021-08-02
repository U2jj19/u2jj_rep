package com.company;

import java.util.*;

public class p_4 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i,flag=0;
            for (int j =1;j<=n;j++)
            {
                if(j==1 || j==0)
                {
                    continue;


                }
                flag = 0;

                for(i=2 ; i<=j/2; ++i)
                {

                    if(j % i == 0)
                    {
//                        System.out.println("not prime");
                        flag = 1;
                        break;

                    }

                    if(flag == 0)
                    {
                        System.out.println(j);
                    }
                }

            }



        }
        catch (Exception e)
        {

        }
    }
}
