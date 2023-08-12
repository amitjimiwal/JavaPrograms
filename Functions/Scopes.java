/*
 Scope means the block or portion of a code where a particular variable or function can be accessed and modified or initialised
 =Function scope
 =Block scope
 */
class FunctionScope{
         public static void main(String[] args) {
                  int a=10;
                  // anything initialised inside a method can only be accesed or modified inside the method only
         }
         void dummy(){
                  // System.out.println(a);   you cant access a here
         }
}

class BlockScope{
         public static void main(String[] args) {
                  int a=10;
                  {
                           // this is a block.
                           // int a=10;  this cant be done as anything initialised outside a block cant be initialised inside the block
                           a=20;
                           // this can be done as we can modify this

                           int c=30;
                  }
                  // System.out.println(c); this cant be done because anything initialised inside a block can only be accessed inside that block only
         }
}
