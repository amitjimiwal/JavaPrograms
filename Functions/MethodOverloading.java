/*


Method Overloading or function overloading basiccally means that
two functions can have same name only if their arguments are different.
if the arguments are  same then it will show eroor


 */



public class MethodOverloading {
    public static void main(String[] args) {
        fun(79);
        fun("amit");
    }
//    static void fun(int z){}
//    IT WILL SHOW ERROR WITH INT A fun as both have same name and same type of argument.

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
