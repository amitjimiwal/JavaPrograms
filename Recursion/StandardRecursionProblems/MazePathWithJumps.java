
class Solution{
    public static void main(String[] args){
        System.out.println(getMazeWithJumps(0,0,2,2));
        /*
        Ouput Arrays!
        [h1h1v1v1, h1h1v2, h1v1h1v1, h1v1v1h1, h1v1d1, h1v2h1, h1d1v1, h2h1v1v1, h2h1v2, h2v1h1v1, h2v1v1h1, h2v1d1, h2v2h1, h2d1v1, v1h1h1v1, v1h1v1h1, v1h1d1, v1h2h1v1, v1h2v1h1, v1h2d1, v1v1h1h1, v1v1h2h1, v1d1h1, v2h1h1, v2h2h1, d1h1v1, d1v1h1, d1d1, d2]
        */
    }
    static List<String> getMazeWithJumps(int sc,int sr,int dr,int dc){
    List<String> paths=new ArrayList<>();
    //base condition
    if(sr==dr & sc==dc){
      paths.add("");
      return paths;
    }

    if(sr>dr || sc>dc) return paths;
    //horizontal moves
    for(int i=1;i<=dc-sc;i++){
      List<String> path=getMazeWithJumps(sc+1, sr, dr, dc);
      for(String s:path) paths.add("h"+i+s);
    }
    //vertical moves
    for(int i=1;i<=dr-sr;i++){
      List<String> path=getMazeWithJumps(sc, sr+i, dr, dc);
      for(String s:path) paths.add("v"+i+s);
    }
    //diagonal moves
    for(int i=1;i<=Math.min(dc-sc,dr-sr);i++){
      List<String> path=getMazeWithJumps(sc+i, sr+i, dr, dc);
      for(String s:path) paths.add("d"+i+s);
    }

    return paths;
  }
}