/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/1/2020
 *   Time: 1:30 PM
 *   File: ByInterface.java
 */

package ThreadingRunnableInterface;

public class ByInterface implements Runnable {
    public final Thread thread;

    public ByInterface() {
        this.thread = new Thread(this, "runabl");
    }

    @Override
    public void run() {

    }
}