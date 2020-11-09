/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/9/2020
 *   Time: 11:40 PM
 *   File: Hashset.java
 */

package HashSet;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("aryan ");
        nameSet.add("is ");
        nameSet.add("not");
        nameSet.add("good");
        nameSet.add("at coding");
        nameSet.add("good");
        System.out.println(nameSet);//it will print the strings according to ascii preferences.


    }
}