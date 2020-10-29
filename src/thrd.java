/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 10/29/2020
 *   Time: 11:07 AM
 *   File: thrd.java
 */

public class thrd extends Thread {
    public final static int n = 10;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < n; i++) {
            System.out.println("Thread no" + i);
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}