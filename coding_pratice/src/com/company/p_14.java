package com.company;

import java.util.*;

public class p_14 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n!=0)
            {
                for (int i = 1;i <=n;++i)
                {
                    int result = 0 ;
                    result = 3*i + 2 ;


                    if(result % 4 != 0)
                    {

                        System.out.println(result);


                    }

                }

            }




        }
        catch (Exception e)
        {

        }
    }
}
