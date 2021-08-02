package com.company;

import java.util.*;

public class p_7 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int basic = sc.nextInt();
            String str = sc.next();
            char c=str.charAt(0);
            int total_sal=0,da=0,allow = 0,pf=0,hra=0;

            hra=20*basic/100;
            da=50*basic/100;
            pf=11*basic/100;

            if (c==65)
            {
                allow = 1700;

                total_sal = basic + hra + da  - pf + allow;
                System.out.println(total_sal);
            }
            else if ( c==66  )
            {
                allow = 1500;

                total_sal = basic + hra + da + allow - pf;
                System.out.println(total_sal);
            }
            else
            {

                total_sal = basic + hra + da + 1300 - pf;
                System.out.println(total_sal);
            }






        }
        catch (Exception e)
        {

        }
    }
}
