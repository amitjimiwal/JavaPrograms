package threading;
// getName() setName(String) are two methods of Thread Class to get and set the Name of a thread in java.
// In java every thread has a name it can be given by the programmer or automatically by the JVM


class Exp1 implements Runnable{
      public void run(){
            System.out.println("Thread 1");
      }
}
class T2 implements Runnable{
      public void run(){
            System.out.println("Thread 2");
      }
}
public class ThreadFunc {
      public static void main(String[] args) throws Exception {
            T2 objT2=new T2();
            Thread t1= new Thread(objT2);
            System.out.println(t1.getName());
            t1.setName("Jimmy");
            System.out.println(t1.getName());
            t1.start();
            t1.join();
            // join stops the execution of all the other threads until it gets completed 
            System.out.println(t1.isAlive());
      }
}
