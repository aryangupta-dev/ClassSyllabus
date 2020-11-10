/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/10/2020
 *   Time: 11:23 PM
 *   File: Example.java
 */

package HashMap;

import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> studentRoll = new HashMap<>();
        studentRoll.put(1, "Ankit");
        studentRoll.put(2, "Anamika");
        studentRoll.put(3, "Ram");
        studentRoll.put(4, "chacha");
        //printing in the collection like an array .
        System.out.println(studentRoll);

    }
}