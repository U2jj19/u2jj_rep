package com.company;

public class p_42 {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        if(num <= 1)
        {
            System.out.println("not prime");
        }
        else if (num == 2)
        {
            System.out.println("not prime");
        }
        else
        {

            for (int i =3;i<Math.sqrt(num);i+=2)
            {
                if(num % i == 0)
                {
                    count++;

                }



            }


        }
    }
}
