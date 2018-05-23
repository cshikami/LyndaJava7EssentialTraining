package com.cshikami;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

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

        char[] chars = {'H','e','l','l','o', '!'};
        String s = new String(chars);
        System.out.println(s);

        String s3 = "Shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4; //automatically turned into strings during the compilation process
        System.out.println(s5);

        char[] chars2 = {'H', 'e', 'l', 'l', 'o'};
        String s6 = new String(chars2);
        System.out.println(s6);

        char[] chars3 = s6.toCharArray(); //convert string array to char array

        for (char c : chars3) { //for each character in character array chars3
            System.out.println(c); //print out each character
        }

        //converting primitives to strings

        int intValue7 = 42;
        String fromInt = Integer.toString(intValue7);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue2 = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue2);
        System.out.println(formatted);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2; //if you're dealing with a lot of string concatenation, can cause problems
                                          //with memory management
        System.out.println(str3);

        //instead, recommended that you use a class called StringBuilder

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);

        //could also do it like this:

        StringBuilder sb2 = new StringBuilder("Hello")
                .append(",")
                .append(" World")
                .append("!");
        System.out.println(sb2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0,sb.length());
        for (int j = 0; j < 3; j++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb);

        String str4 = "Hello";
        String str5 = "Hello"; //compiler looked in table of existing strings and pointed this reference variable
                                //to the original object
                                //strings are immutable so it is safe to simply point second variable's value to first variable


        if (str4 == str5) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match");
        }

        String str6 = "hello";  //didn't find a match, so it created a new object and the entire string is lower case
        if (str4 == str6) {
            System.out.println("They match");
        } else {
            System.out.println("They don't match");
        }

        String part1 = "Hello ";
        String part2 = "World";
        String str7 = part1 + part2; //compiler puts String values together but does not have enough information at compile
                                    //time to know for sure that these will match so str7 is created as another object

        String str8 = "Hello World"; //str8 is a completely different object because the compiler does not know that str7
                                    //matches str8

        if (str7 == str8) {
            System.out.println("They match");
        } else {
            System.out.println("They don't match");
        }

        //the right way to compare two strings, use equalsIgnoreCase to check whether two strings are the same regardless of case
        if (str7.equals(str8)) {
            System.out.println("They match");
        } else {
            System.out.println("They don't match");
        }

        Locale locale = new Locale("da","DK");

        double doubleValue3 = 1_234_567.89;

        //use NumberFormat to take a primitive value and display it as a String

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue3));

        NumberFormat numF2 = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF2.format(doubleValue3));

        NumberFormat curF = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + curF.format(doubleValue3));

        NumberFormat curF2 = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF2.format(doubleValue3));

        NumberFormat intF = NumberFormat.getIntegerInstance(); //rounds to integer
        System.out.println("Integer: " + intF.format(doubleValue3));

        String s9 = "Welcome to California!";
        System.out.println("Length of string: " + s9.length());

        int position = s9.indexOf("California");
        System.out.println("Position of substring: " + position);

        String sub = s9.substring(11);
        System.out.println("Position of substring: " + sub);

        String s10 = "Welcome!                    ";
        int len1 = s10.length(); //length of s10 including white spaces
        System.out.println(len1);

        String s11 = s10.trim(); //trims off white spaces
        System.out.println(s11.length());

        Date d1 = new Date();
        System.out.println(d1);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);

        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf.format(ld));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf2.format(ld));

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        double userinput2 = scanner2.nextDouble();

        System.out.println("Enter a numeric value: ");
        double userinput3 = scanner2.nextDouble();

        double totalofinput = userinput2 + userinput3;
        System.out.println(totalofinput);

        /**
         * another way to do this is to convert from String to Double using parseDouble
         * System.out.println("Enter a numeric value: ");
         * String input1 = sc.nextLine();
         * double d1 = Double.parseDouble(input);
         *
         * System.out.println("Enter a numeric value: ");
         * String input2 = sc.nextLine();
         * double d2 = Double.parseDouble(input2);
         *
         * double result = d1 + d2;
         *
         * System.out.println("The answer is " + result);
         */

        String s12 = null; //String s = Null is a syntax error

        System.out.println(s12);

        String welcome = "Welcome!";
        char[] chars4 = welcome.toCharArray();

        try { //to get this automatically, do Code -> Surround With... -> try/catch

            if (chars.length < 10) {
                throw (new Exception("My custom message")); //throw your own exception
            }
            char lastChar = chars4[chars4.length-1];
            System.out.println(lastChar);

            String sub2 = welcome.substring(10);

        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index problem!");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("String index problem!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //programming conditional logic
        int monthNumber = 13;

        if (monthNumber >= 1 && monthNumber <= 3) {
            System.out.println("You're in Quarter 1");
        } else if (monthNumber >= 4 && monthNumber <= 6) {
            System.out.println("You're in Quarter 2");
        } else if (monthNumber >= 7 && monthNumber <= 9) {
            System.out.println("You're in Quarter 3");
        } else if (monthNumber >= 10 && monthNumber <= 12) {
            System.out.println("You're in Quarter 4");
        } else {
            System.out.println("That's an unknown month");
        }

        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String sc2input = sc2.nextLine();
        int monthNumber2 = Integer.parseInt(sc2input);

        switch(monthNumber2) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            default:
                System.out.println("You chose another month");
        }

//        for (int k = 0; k <= chars4.length - 1; k++) {
//            System.out.println(chars4[k]);
//        }



    }

}
