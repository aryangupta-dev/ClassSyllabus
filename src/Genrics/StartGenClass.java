/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/2/2020
 *   Time: 10:23 PM
 *   File: StartGenClass.java
 */

package Genrics;

public class StartGenClass<T> {
    public void method1(T Parameter) {
        System.out.println(Parameter.getClass().getSimpleName());
    }

}