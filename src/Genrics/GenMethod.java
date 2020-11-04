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

    public Type divisor(Type a) {
        return a;
    }
}