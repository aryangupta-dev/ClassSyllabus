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
        System.out.println("The thread " + thread.getName() + " has started.");
        for (int index = 0; index < limit; index++) {
            System.out.println(thread.getName() + ": " + index);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.err.print(e.getMessage());
            }
        }
        System.out.println("The thread " + thread.getName() + " has closed.");
    }
}