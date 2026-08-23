package tasks.plan.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread1: lockA");
                synchronized (lockB) {
                    System.out.println("Thread1: lockB");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread2: lockB");
                synchronized (lockA) {
                    System.out.println("Thread2: lockA");
                }
            }
        });

        thread1.start();
        thread2.start();
        // Mutual exclusion + Hold and Wait + No Preemption + Circular Wait = Deadlock
        // If at least one of these conditions is violated, a classic deadlock is impossible.
    }
}
