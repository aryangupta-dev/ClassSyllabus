/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/3/2020
 *   Time: 1:11 PM
 *   File: GenMethod.java
 */

package Genrics;

public class GenMethod {
    public <Type extends Number> int divisor(int a, int b) {
        int quotient = a / b;
        return quotient;
    }
}