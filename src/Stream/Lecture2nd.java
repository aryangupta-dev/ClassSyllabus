/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/4/2020
 *   Time: 12:32 PM
 *   File: Lecture2nd.java
 */

package Stream;

import java.util.ArrayList;

public class Lecture2nd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(74);
        list.add(12);
        list.add(14);
        var listStream = list.stream();
        listStream = listStream.filter(number -> number % 2 == 0).filter(number -> number > 20);
        listStream.forEach(number -> System.out.println(number));
    }
}
