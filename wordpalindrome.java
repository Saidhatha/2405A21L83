public class wordpalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String clear = str.toLowerCase().replaceAll("[^a-z]", "");
        String rev = new StringBuilder(clear).reverse().toString();
        if (clear.equals(rev)) {
            System.out.println(str + " --> It is a palindrome");
        } else {
            System.out.println("Not a palindrome sentence");
        }
    }
}
