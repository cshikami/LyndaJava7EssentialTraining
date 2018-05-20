package com.cshikami;

import java.math.BigDecimal;

public class Main {

    static boolean bDef;

    public static void main(String[] args) {

        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;

        float f = 1f;
        double d = 1d;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        double value = .012;

        double pSum = value + value + value;

        System.out.println("Sum of primitives: " + pSum); //value is inaccurate

        //need to convert Double value to String type in order to convert to BigDecimal type
        //and then use add method which is part of the BigDecimal class to add String type values together
        //then convert back to String type value by using toString()
        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);

        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());


        int intValue1 = 56;
        int intValue2 = intValue1; //make a copy of 56, not a reference to the same value
        System.out.println("The 2nd value is: " + intValue2);

        //widening the type is ok, for example, going from int to long, doesn't lose any information
        long longValue1 = intValue1;

        System.out.println("The long value is: " + longValue1);

        //sometimes narrowing still works
        //whenever going from wider value to narrower value, must using casting syntax
        short shortValue1 = (short) intValue1;
        System.out.println("The short value is: " + shortValue1);

        //narrowing the type results in a loss of information, for example, going from int to byte
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is: " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("The int value is: " + intValue4);

        int intValue5 = 56;
        int intValue6 = 42;

        int result1 = intValue5 + intValue6;
        System.out.println("Addition: " + result1);

        int result2 = intValue5 - intValue6;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue5 * intValue6;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intValue5 / intValue6;
        System.out.println("Division: " + result4);

        double result5 = (double) intValue5 % intValue6;
        System.out.println("Remainder: " + result5);

        double doubleValue2 = -3.99999;
        long rounded = Math.round(doubleValue2);

        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(doubleValue2);
        System.out.println("Absolute: " + absValue);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);

        //bDef is static variable assigned at the top
        System.out.println("The value of bDef is: " + bDef);

        boolean b3 = !b1;

        System.out.println("The value of b3 is: " + b3);

        int i1 = 0;

        boolean b4 = i1 != 0;
        System.out.println("The value of b4 is: " + b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);

        System.out.println("Parsed: " + parsed);

        char c1 = '1'; //literals for chars in single quotes, strings in double quotes
        char c2 = '2';
        char c3 = '3';

        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        char dollarSign = '\u0024';
        System.out.println("Currency: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        //equality operators
        //with primitive values, it compares the actual values
        //with reference variables (variables that point to objects, you're comparing
        //whether the two variables are pointing to the same object, not necessarily
        //whether they have the same value

        //comparing strings
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1.equals(s2)) {
            System.out.println("They match!");
        } else {
            System.out.println("No match!");
        }
    }

    //logical operators
    // &&  means and
    // || means Or
    // ?: means Ternary (short-hand for if-then)

    //String s = condition ? trueValue : falseValue

    //Java classes define objects

    //an object is an instance of a class
    //nonprimitive variables are references to objects.
    //Objects can have multiple references

        //for example might have an object anObject, and you can have three different variables pointing to the same thing
        //if something changes about that object in memory, all three variables would update


}
