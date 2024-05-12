class Demo {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();
          while (t-- > 0) {
               int a = sc.nextInt();
               int b = sc.nextInt();
               System.out.println(Math.min(a, b) + " " + Math.max(a, b));
          }
          System.out.println(getStairsPath(5).size());
     }

     private static List<String> getStairsPath(int stairs) {
          ArrayList<String> path = new ArrayList<>();
          //base condition
          if (stairs<0){
               return path;
          }else if(stairs==0){
               path.add("");
               return path;
          }
          List<String> oneStepPaths = getStairsPath(stairs - 1);
          List<String> twoStepPaths = getStairsPath(stairs - 2);
          List<String> threeStepPaths = getStairsPath(stairs - 3);
          for (String i : oneStepPaths)
               path.add("1" + i);
          for (String i : twoStepPaths)
               path.add("2" + i);
          for (String i : threeStepPaths)
               path.add("3" + i);
          return path;
     }
}