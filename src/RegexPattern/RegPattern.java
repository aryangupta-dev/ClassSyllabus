/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/29/2020
 *   Time: 4:09 PM
 *   File: RegPattern.java
 */

package RegexPattern;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegPattern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}$");
        String input = JOptionPane.showInputDialog(
                null,
                "Input the Aadhar no.",
                "Input!",
                JOptionPane.PLAIN_MESSAGE
        );
        Matcher match = pattern.matcher(input);
        if (match.matches()) {
            JOptionPane.showMessageDialog(
                    null,
                    "The string is passed",
                    "PASSED",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "The string is failed",
                    "FAILED",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

    }
}