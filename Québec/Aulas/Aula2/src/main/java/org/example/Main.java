package org.example;

public class Main {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; passou a quantidade de bytes

        //int i1 = -1000000000000;
        int i2 = 28500;

        long l1 = 10000000000L;
        long l2 = 200000000000L;

        //float f1 = 4.5; precisa indicar ao final do numero a letra "f"
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.84d;

        char c1 = 'w';
        //char c2 = 'Tw'; somente uma letra
        char c3 = '\u0057';


        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "lorem lorem lorem";

        String dt1 = "09/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
    
}