package threading;
class Hi implements Runnable{
      public void run() {
            for (int index = 0; index <5; index++) {
                  System.out.println("Hii");
            }
      }
}

class Hello implements Runnable{
      public void run() {
            for (int index = 0; index <5; index++) {
                  System.out.println("Hii");
            }
      }
}


public class RunnableInterface {
      public static void main(String[] args) {
            Hi obj1=new Hi();
            Hello obj2=new Hello();
            // if we now create obj1.run then it will not create any thread and run as normal methods

            // TO DO THREADING
            // creating thread class objects uisng runnable interface objects given to the constructor thread class
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);
            t1.start();
            t2.start();

      }
}
