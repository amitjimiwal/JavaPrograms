package threading;
class A{
      int count=0;
       synchronized void increment(){
          count++;
      }
}
class Thread1 extends Thread{
      A obj;
      Thread1 (A ob){
            this.obj=ob;
      }
      public void run(){
            for (int i = 0; i<1000; i++) {
                  obj.increment();
            }
      }
}

public class SynchronizedMethod {
      public static void main(String[] args) throws InterruptedException {
            A obj=new A();
            Thread1 t1=new Thread1(obj);
            Thread1 t2=new Thread1(obj);
            System.out.println("Main");
            t1.start();
            t2.start();
            t1.join();
            System.out.println(obj.count);
      }
}
