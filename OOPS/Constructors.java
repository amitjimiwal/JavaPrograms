package OOPS;

class S {
      // properties  
      int roll;
      String name;
      float marks;
      // default constructor
      S(){
            this.roll=1;
            this.marks=88.5f;
            this.name="Admin";
      }
      // parametrized constructor
      S(int rno, String name, float number){
            this.roll=rno;
            this.name=name;
            this.marks=number;
      }
      // copy constructor
      S(OOPS.S student){
            this.roll=student.roll;
            this.name=student.name;
            this.marks=student.marks;
      }
      void display(){
            System.out.println(this.roll);
            System.out.println(this.name);
            System.out.println(this.marks);
      }
}
public class Constructors {
      public static void main(String[] args) {
            OOPS.S s1=new OOPS.S();
            OOPS.S s2=new OOPS.S(10,"Amit Jimiwal", 99);
            OOPS.S s3=new OOPS.S(s2);
            s1.display();
            s2.display();
            s3.display();
      }
}
