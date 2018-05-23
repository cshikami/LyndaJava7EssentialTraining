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

public class SwitchStrings {

    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sc2input = sc2.nextLine();

        switch(sc2input) {
            case "Jan":
                System.out.println("The month is 1");
                break;
            case "Feb":
                System.out.println("The month is 2");
                break;
            case "Mar":
                System.out.println("The month is 3");
                break;
            default:
                System.out.println("You chose another month");
        }

//        for (int k = 0; k <= chars4.length - 1; k++) {
//            System.out.println(chars4[k]);
//        }


    }

}
