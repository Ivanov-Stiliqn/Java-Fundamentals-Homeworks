/*
Problem 3.	Assign Variables
Find suitable types for variables. You are given the following types: byte, short, int, long, char, boolean, float, double, and String.
Assign the following values to them false, “Palo Alto, CA”, 32767, 2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
Try to assign 32768 to short and see what happens.

 */

public class Problem_03 {

    public static void main(String[] args) {

        boolean bool=false;
        String myString="Palo Alto, CA";
        int myInt=32767;
        int myInt2=2000000000;
        double myDouble=0.1234567891011;
        float  myFloat=0.5f;
        long myLong=919827112351L;
        byte myByte=127;
        char myChar='c';
        short myShort=(short)32768;
        System.out.println(bool);
        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myLong);
        System.out.println(myByte);
        System.out.println(myChar);
        System.out.println(myShort);
    }
}

