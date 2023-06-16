package OOPS;
class Student{
      // properties
      int roll;
      String name;
      float marks;
      // default constructor
      Student(){
            this.roll=1;
            this.marks=88.5f;
            this.name="Admin";
      }
      // parametrized constructor
      Student(int rno,String name,float number){
            this.roll=rno;
            this.name=name;
            this.marks=number;
      }
      // copy constructor
      Student(Student student){
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
            Student s1=new Student();
            Student s2=new Student(10,"Amit Jimiwal", 99);
            Student s3=new Student(s2);
            s1.display();
            s2.display();
            s3.display();
      }
}
