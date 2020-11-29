/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/29/2020
 *   Time: 4:32 PM
 *   File: Methds.java
 */

package RegexPattern;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methds {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{4}");
        String input = JOptionPane.showInputDialog(
                null,
                "Input the string to check",
                "INPUT!",
                JOptionPane.INFORMATION_MESSAGE
        );
        /*
         *If input is another than the no of four digits it will give false as output in line 27 sout.
         * */
        Matcher match = pattern.matcher(input);
        System.out.println(match.matches());
        /**
         * If find() found any subset that match with the input it will return true.
         * */
        System.out.println(match.find());
    }
}