package Pascal;

import java.util.ArrayList;
//find a row of a pascal triangle
public class FIndRow {
     public static void main(String[] args) {
          //use an 2D ArrayList
          System.out.println(findRow(4));
     }
     static ArrayList<Integer> findRow(int row){
          ArrayList<Integer> ans=new ArrayList<>();
          int res=1;
          ans.add(res);
          for (int i = 1; i < row; i++) {
               res*=(row-i);
               res/=i;
               ans.add(res);
          }
          return ans;
     }

}
