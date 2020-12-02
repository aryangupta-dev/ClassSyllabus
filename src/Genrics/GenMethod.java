/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/3/2020
 *   Time: 1:11 PM
 *   File: GenMethod.java
 */

package Genrics;

public class GenMethod<Type extends Number> {
    private int rollNo;

    public static <Type extends String> Type method2(Type rollNo) {
        return rollNo;
    }

    static <Type extends Number> Type divisor(Type a) {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(GenMethod.method2("12"));
        System.out.println(divisor(16));
    }
}