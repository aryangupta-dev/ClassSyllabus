/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/27/2020
 *   Time: 11:09 AM
 *   File: ExampleOfEnums.java
 */

package Enums;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExampleOfEnums {
    public static void main(String[] args) {
        String month = String.valueOf(new GregorianCalendar().get(Calendar.MONTH));
        int currentDate = (int) (Math.random() * 31 + 1);

    }
}