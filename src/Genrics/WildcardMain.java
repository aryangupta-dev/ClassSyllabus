/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/4/2020
 *   Time: 11:49 PM
 *   File: WildcardMain.java
 */

package Genrics;

public class WildcardMain {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        Wildcard<Integer> numbers = new Wildcard<>(nums);
        Double[] anoherNums = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Wildcard<Double> objNum = new Wildcard<>(anoherNums);
        System.out.println(numbers.calculateAverage());
        System.out.println(objNum.calculateAverage());
        System.out.println("No are same ????  " + numbers.comapareAverage(objNum));

    }
}