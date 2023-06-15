package threading;

// thread is a lightweight subprocess, or we can say smallest units of a subprocess. Ex-Amazon app search executes a search thread rather than stopping the main thread and then executing
// default there is only one thread in Java that is the main thread. psvm one
class Hi extends Thread {
      public void run() {
            for (int index = 0; index < 5; index++) {
                  System.out.println("Hii");
                  try {
                        // Thread method referes to the current thread that is executing this function
                        // here
                        Thread.sleep(500);
                  } catch (Exception e) {

                  }
            }
      }
}

class Hello extends Thread {
      public void run() {
            for (int index = 0; index < 5; index++) {
                  System.out.println("Hello");
                  try {
                        // Thread method referes to the current thread that is executing this function
                        // here
                        Thread.sleep(500);
                  } catch (Exception e) {

                  }
            }
      }
}

public class FirstThread {
      public static void main(String[] args) {
            System.out.println("Hello ji");
            Hi obj1 = new Hi();
            Hello obj2 = new Hello();
            obj1.start();
            obj2.start();     
      }
}
