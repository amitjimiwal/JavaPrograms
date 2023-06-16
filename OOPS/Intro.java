package OOPS;
/*
Class is a named group of properties and functions,which are used to create objects. Class is an template of an Object
Class : class <class_name>{
      properties
      methods
}

Objects: real world entity. Instance of a class. Made dynamically using new Keyword.
*/

class Student{
      // properties
      int roll;
      String name;
      float marks;
}
class A{

}
public class Intro {
      public static void main(String[] args) {
            // creating a object(created at runtime in heap memory)
            // reference variable s1 in stack memory points to this object in heap of student class
            Student s1=new Student();
            s1.roll=10;
            s1.marks=88;
            s1.name="Sushil XD";
            System.out.println(s1); //OOPS.Student@2c7b84de
            System.out.println(s1.marks+s1.name+s1.roll);
      }
}
