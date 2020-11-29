/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/29/2020
 *   Time: 4:09 PM
 *   File: RegPattern.java
 */

package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegPattern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}$");
        Matcher match = pattern.matcher("5671 8481 8453");
        System.out.println(match.matches());
    }
}