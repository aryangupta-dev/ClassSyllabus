/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/3/2020
 *   Time: 1:23 PM
 *   File: BoundedClass.java
 */

package Genrics;

public class BoundedClass<Type extends Number> {
public <T extends Double> int addition(int a, int b) {
    int sum = a + b;
    return sum;
}
}