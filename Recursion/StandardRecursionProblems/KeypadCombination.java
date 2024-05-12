class Solution {
    static HashMap<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans=new ArrayList<>();
        if(digits.length()<1){
           return ans; 
        }
        map.put('2',"abc");
		map.put('3',"def");
		map.put('4',"ghi");
		map.put('5',"jkl");
		map.put('6',"mno");
		map.put('7',"pqrs");
		map.put('8',"tuv");
		map.put('9',"wxyz");
        ans=getKeyC(digits);
        return ans;
    }
    static ArrayList<String> getKeyC(String s){
		if(s.length()==0){
			ArrayList<String> a=new ArrayList<>();
			a.add("");
			return a;
		}
		char key=s.charAt(0);
		char[] ch=map.get(key).toCharArray();
		ArrayList<String> ss=getKeyC(s.substring(1));
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<ch.length;i++){
			for(int j=0;j<ss.size();j++){
				ans.add(String.valueOf(ch[i])+ss.get(j));
			}
		}
		return ans;
	}
}