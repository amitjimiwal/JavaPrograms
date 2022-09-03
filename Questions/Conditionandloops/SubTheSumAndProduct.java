//WAP to give the subtraction of sum and product of
// digits of the integer.
/*
   for ex-
   n-123
   sum=1+2+3=6 and product=1*2*3=6
   output=6-6=0
 */

public class SubTheSumAndProduct {
    public static void main(String[] args) {
        int n=12345,product=1,sum=0,result,rem;
        /*
        n-integer
        product-product of digits
        sum-sum of digits
        result-output
        rem-last digit of integer
         */
        while (n>0){
            rem=n%10;//last digit return
            sum+=rem;
            product*=rem;
            n=n/10;
        }
        result=product-sum;
        System.out.println(result);
    }
}
