package OOPS;

class Student{
      int roll;
      String name;
      float marks;
}
public class Intro {
      public static void main(String[] args) {
            Student s1=new Student();
            s1.roll=10;
            s1.marks=88;
            s1.name="Sushil XD";
            System.out.println(s1); //OOPS.Student@2c7b84de
            System.out.println(s1.marks+s1.name+s1.roll);
      }
}
