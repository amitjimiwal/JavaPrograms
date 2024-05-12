 public static ArrayList<String> getSubSequence(String s) {
          ArrayList<String> ans = new ArrayList<>();
          // base case
          if (s.length() == 1) {
               ans.add(Character.toString(s.charAt(0)));
               return ans;
          }
          ArrayList<String> ss = getSubSequence(s.substring(1));
          char c = s.charAt(0);
          for (String x : ss) {
               if (x.equals("")) continue;
               else {
                    ans.add(c + x);
                    ans.add(x);
               }
          }
          ans.add(Character.toString(c));
          return ans;
}