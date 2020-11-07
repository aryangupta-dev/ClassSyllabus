package Arraylist;/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/7/2020
 *   Time: 11:54 AM
 *   File: Arraylist.ArrayLst.java
 */

import java.util.ArrayList;

public class ArrayLst {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();//dynamic array of integer type.
        obj.add(45);
        obj.add(12);
        obj.add(56);
        obj.add(78);
        obj.add(65);
        ArrayList<String> object = new ArrayList<>();//string type array.
        object.add("Aryan ");
        object.add("is ");
        object.add("not an engineer");
        object.add("just a robot");
        System.out.println(obj);
        System.out.println(object);

    }
}