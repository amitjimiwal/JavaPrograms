package DSA;

public class LongestSubarrayWithSumK {
     public static void main(String[] args) {
          int[] arr={1,2,3,1,1,1,1,4,2,3};
          System.out.println(Solution.getLongestSubarray(arr, 3));
     }  
}
class Solution{
     public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
          int n=nums.length;
          int maxlen=0;
          for (int i = 0; i < n; i++) {
               int sum=nums[i];
               for (int j = i+1; j < n; j++) {
                    sum+=nums[j];
                    if(sum==k) maxlen=Math.max(maxlen, (j-i)+1);
               }
          }
		return maxlen;
	}
}
