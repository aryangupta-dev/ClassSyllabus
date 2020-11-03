/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/2/2020
 *   Time: 10:28 PM
 *   File: Main.java
 */

package Genrics;

public class Main {
    public static void main(String[] args) {
        StartGenClass<Integer> obj = new StartGenClass<Integer>();
        obj.method1(45);
        StartGenClass<Double> obj1 = new StartGenClass<Double>();
        obj1.method1(45.4);
        BoundedClass<Integer> object = new BoundedClass<>();
        System.out.println(object.addition(45, 45));


    }
}