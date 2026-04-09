package multiThread;

/**
 *
 * @author MR.IPI
 */

/** A runnable that repeatedly prints a greeting.
 */
public class GreetingThreadRunner
{
    
/**
Constructs the runnable object.
    @param aGreeting the greeting to display
 */
    

    public static void main(String[] args) {
        GreetingRunnable r1 = new GreetingRunnable("Hello");
        GreetingRunnable r2 = new GreetingRunnable("Goodbye");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}