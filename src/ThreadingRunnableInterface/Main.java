package ThreadingRunnableInterface;/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/26/2020
 *   Time: 11:14 AM
 *   File: ThreadingRunnableInterface.Main.java
 */


public class Main {
    public static void main(String[] args) {
        MultiThreading object = new MultiThreading();
        object.getThread().start();
        thrd obj = new thrd();
        obj.start();
    }
}