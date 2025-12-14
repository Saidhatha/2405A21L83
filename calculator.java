    import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+ or - or * or /): ");
        char op = sc.next().charAt(0);
        double result;
        if (op == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation entered.");
        }
        sc.close();
    }
}
