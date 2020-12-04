/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/4/2020
 *   Time: 11:54 AM
 *   File: Lecture1st.java
 */

package Stream;

import java.util.ArrayList;

public class Lecture1st {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(23);
        list.add(4);
        var listStream = list.stream();
        var smallestNumber = listStream.min(Integer::compare);
        System.out.println("Original list " + list);
        System.out.println(smallestNumber);
    }
}