package com.company;

public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        int a  = 6*5-34/2;
        System.out.println(a);

        //precedence and Associativity
        /*
        The Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */

        int b = 60/5-34*2;
        /* 12 - 34*2
           = 12 - 68
           = -56
        */
        System.out.println(b);

        //Quick Quiz
        int x =6;
        int y = 1;
        int k = x * y/2; //  3
        System.out.println("k = " +k);

        int p = 0;
        int q = 0;
        int r = 10;
        int s = p*p - (4*r*q)/(2*r);
        System.out.println(s);

    }
}
