package ThreadingRunnableInterface;/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/29/2020
 *   Time: 11:07 AM
 *   File: ThreadingRunnableInterface.thrd.java
 */

public class thrd extends Thread {
    public final static int n = 10;

    @Override
    public void run() {
        Thread.currentThread().setName("Tortoise");
        System.out.println(Thread.currentThread().getName() + " has been started.");
        for (int i = 0; i < n; i++) {
            System.out.println("Tortoise milestone completed : " + i);
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has been closed");

    }
}