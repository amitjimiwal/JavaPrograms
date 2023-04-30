/*
1281. Subtract the Product and Sum of Digits of an Integer
 */

public class SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    static int subtractProductAndSum(int n) {
        int sum=0,product=1,rem,ans;
        while (n>0){ // always check for condition. have done n<0 silly mistake in this code and then demotivated.
            rem=n%10;
            sum+=rem;
            product*=rem;
        }
        ans=product-sum;
        return ans;

    }
}

