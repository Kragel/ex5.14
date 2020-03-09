package com.company;

public class Go {
    static String s1 = "бегом";
    static String s2, s3;
    static
    {
        s2 = "на машине";
        s3 = "на самолёте";
        System.out.println("s2 и s3 инициализированы");
    }
    static void how()
    {
        System.out.println(s1 + " или " + s2 + " или " + s3);
    }
    Go()
    {
        System.out.println("вперёд()");
    }
}
