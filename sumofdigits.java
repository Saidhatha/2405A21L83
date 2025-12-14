public class sumofdigits {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static int sumRange(int start, int end) {
        if (start > end) {
            return 0;
        }
        return sumOfDigits(start) + sumRange(start + 1, end);
    }
    public static void main(String[] args) {
        int from = 90;
        int to = 150;
        int result = sumRange(from, to);
        System.out.println("Sum of digits from " +from+" to "+to+" = "+result);
    }
}

