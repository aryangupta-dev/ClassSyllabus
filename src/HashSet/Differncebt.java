/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/9/2020
 *   Time: 11:50 PM
 *   File: Differncebt.java
 */

package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Differncebt {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("aryan ");
        nameSet.add("is ");
        nameSet.add("not");
        nameSet.add("good");
        nameSet.add("good");
        //it will remove the duplicate string from the dynamic array.
        System.out.println(nameSet);
        ArrayList<String> nameSet2 = new ArrayList<>();
        nameSet2.add("aryan ");
        nameSet2.add("is ");
        nameSet2.add("not");
        nameSet2.add("good");
        nameSet2.add("good");
        //it will take the duplicate string in the array
        System.out.println(nameSet2);
    }
}