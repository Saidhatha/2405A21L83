public class palindrome {
    public static void main(String[] args) {
        int a=22;
        int newno =a;
        int rev=0;
        while(a!=0){
            int rem=a%10;
            rev=(rev*10)+rem;
            a=a/10;
        }{
            if (rev == newno)
                System.out.println("palindrome");
            else
                System.out.println("not palindrome");
            }
        }
    }

