package Patterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SetHash {
     public static void main(String[] args) {
          Set<String> names=new HashSet<>();
          names.add("amit");
          names.add("Jimiwal");
          names.add("Jimiwal2");
          names.add("walter");
          names.remove("Walter");
          names.add(null); //can add null
          // names.clear();
          System.out.println(names.isEmpty());

          //iterating through a set
          for (String string : names) {
               System.out.println(string);
          }


          //set doesn't contain duplicate but List contains duplicates
          //set don't have any order it can put elements in any order.
          List<Integer> numbers=new ArrayList<>();
          numbers.add(1);
          numbers.add(2);
          numbers.add(2);
          numbers.add(1);
          System.out.println(numbers);

          //converting them into set 
          Set<Integer> numset=new HashSet<>();
          numset.addAll(numbers);
          System.out.println(numset);

     }
}
