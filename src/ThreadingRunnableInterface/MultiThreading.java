package ThreadingRunnableInterface;/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/26/2020
 *   Time: 10:24 AM
 *   File: ThreadingRunnableInterface.MultiThreading.java
 */

public class MultiThreading implements Runnable {
    public final static int limit = 10;
    public final Thread thread;

    public MultiThreading() {
        thread = new Thread(this, "Rabbit");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        System.out.println("The thread " + thread.getName() + " has started.");
        for (int index = 0; index < limit; index++) {
            System.out.println(thread.getName() + " milestone completed : " + index);
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                System.err.print(e.getMessage());
            }
        }
        System.out.println(thread.getName() + " has closed.");
    }
}