/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/4/2020
 *   Time: 12:32 PM
 *   File: Lecture2nd.java
 */

package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Lecture2nd {
    public static void main(String[] args) {
        //Example for the stream on the Wrapper classes
        //The Stream Api is bulit into the collection framework.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(74);
        list.add(12);
        list.add(14);
        var listStream = list.stream();
        listStream = listStream.filter(number -> number % 2 == 0).filter(number -> number > 20);
        //filter operation (Intermdiate operation)
        listStream.forEach(number -> System.out.println(number));
        //terminal of listStream stream u can re use it by defining it again like this
        //listStream=list.stream();
        Double[] carry = {1.7, 5.1, 0.5, 2.30};
        var carryStream = Arrays.stream(carry);
        //We can also create the stream by using the interface in java.util.stream package
        /*1)IntStream Interface
         * 2)LongStream Interface
         * 3)DooubleStream Interface
         * */
        //Example
        var laststream = IntStream.range(1, 100);
        //range 1 to 99;
    }
}
