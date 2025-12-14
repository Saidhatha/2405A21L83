import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        int units = sc.nextInt();
        int total = 0;
        if (units <= 50) {
            total = units * 5;
            System.out.println("Calculation:");
            System.out.println("Units " + units + " * 5 = " + total);
        }
        else if (units <= 100) {
            int first = 50 * 5;
            int second = (units - 50) * 7;
            total = first + second;
            System.out.println("Calculation:");
            System.out.println("First 50 units = 50 *5 = " + first);
            System.out.println("Remaining " + (units - 50) + " units → "+ (units - 50) + " *7 = " + second);
            System.out.println("Total Cost = " + first + " + " + second + " = Rs. " + total);
        }
        else {
            int first = 50 * 5;
            int second = 50 * 7;
            int third = (units - 100) * 10;
            total = first + second + third;
            System.out.println("Calculation:");
            System.out.println("First 50 units =50 * 5 = " + first);
            System.out.println("Next 50 units =50 *7 = " + second);
            System.out.println("Remaining " + (units - 100)+ " units = " + (units - 100)+ " * 10 = " + third);
            System.out.println("Total Cost = " + first + " + " + second+ " + " + third + " = Rs. " + total);
        }
        sc.close();
    }
}