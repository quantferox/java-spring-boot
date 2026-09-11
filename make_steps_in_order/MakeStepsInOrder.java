package make_steps_in_order;

public class MakeStepsInOrder {
  private static final int MAX_COUNT_LEGS = 4;
  private static int currentLeg = 1;
  private final static Object lock = new Object();

  private static class Foot implements Runnable {
    private final int number;

    public Foot(int number) {
      this.number = number;
    }

    public void makeStep() throws InterruptedException {
      synchronized (lock) {
        if (currentLeg >= MAX_COUNT_LEGS + 1) {
          currentLeg = 1;
        }

        if (number == currentLeg) {
          System.out.println("Make step by leg: " + this.number);
          currentLeg++;
          lock.notifyAll();
        } else {
          lock.wait();
        }
      }
    }

    @Override
    public void run() {
      while (!Thread.currentThread().isInterrupted()) {
        try {

          makeStep();
        } catch (InterruptedException error) {
          Thread.currentThread().interrupt();
        }
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread[] threads = new Thread[MAX_COUNT_LEGS];
    for (int x = 0; x < MAX_COUNT_LEGS; x++) {
      threads[x] = new Thread(new Foot(x + 1));
      threads[x].start();
    }

    Thread.sleep(16);

    for (Thread thread : threads) {
      thread.interrupt();
    }
  }
}
