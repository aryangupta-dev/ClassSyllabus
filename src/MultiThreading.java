/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/26/2020
 *   Time: 10:24 AM
 *   File: MultiThreading.java
 */

public class MultiThreading implements Runnable {
    public final static int limit = 10;
    public final Thread thread;

    public MultiThreading() {
        thread = new Thread(this, "t2");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println();
    }
}