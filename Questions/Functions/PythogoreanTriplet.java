/*
PYTHOGOREAMTRIPLET
 Write a function to check if a given triplet is a Pythagorean triplet or not.
  (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
  for ex: triplet(3,4,5) is a pyhtogorean triplet.
 */
public class PythogoreanTriplet {
    public static void main(String[] args) {
        System.out.println(pythogoreantriplet(20, 21, 29));
    }

    static boolean pythogoreantriplet(int a, int b, int c) {
        if (Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2)){
            return true;
        }
        else {
            return false;
        }
    }
}
