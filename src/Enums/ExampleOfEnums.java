/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/27/2020
 *   Time: 11:09 AM
 *   File: ExampleOfEnums.java
 */

package Enums;

import java.util.Scanner;

public class ExampleOfEnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mnth = sc.nextLine().trim().toUpperCase();
        int currentDate = (int) (Math.random() * 31 + 1);
        System.out.println("Current date " + currentDate);
        sc.close();
        Months obj = Months.valueOf(mnth);
        int remainDays = 0;
        switch (obj) {
            case JANUARY:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case FEBRUARY:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case MARCH:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case APRIL:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case MAY:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case JUNE:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case JULY:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case AUGUST:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case SEPTEMBER:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case OCTOBER:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case NOVEMBER:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
            case DECEMBER:
                remainDays = obj.getNoOfDaysInMonth() - currentDate;
                System.out.println("Remaining days " + remainDays);
                break;
        }

    }
}