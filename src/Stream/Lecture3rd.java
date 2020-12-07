/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 12/7/2020
 *   Time: 7:48 PM
 *   File: Lecture3rd.java
 */

package Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture3rd {
    private final static int totalNoOfStudent = 70;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < totalNoOfStudent; i++) {
            studentList.add(new Student(
                    i + 1, (float) (Math.random() * 10), "Name" + (i + 1)
            ));
        }

    }