import java.util.HashSet;
public class Happynumber {
    // Function to calculate sum of squares
    public int sumOfSquares(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit * digit;

            n = n / 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {

            set.add(n);

            n = sumOfSquares(n);
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Happynumber obj = new Happynumber();
        int n = 19;
        boolean result = obj.isHappy(n);
        System.out.println(result);
    }
}

