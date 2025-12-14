    import java.util.Scanner;
public class VotingSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int choice;
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible to vote.");
            sc.close();
            return;
        }
        System.out.println("----- Voting System -----");
        System.out.println("1.Candidate A");
        System.out.println("2.Candidate B");
        System.out.println("3.Candidate C");
        System.out.println("4.Candidate D");
        System.out.println("5.Exit");
        do {
            System.out.print("Enter your vote (1-4) or 5 to exit: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: c1++; break;
                case 2: c2++; break;
                case 3: c3++; break;
                case 4: c4++; break;
                case 5: System.out.println("Voting ended."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        System.out.println("     Voting Results");
        System.out.println("Candidate A: " + c1 + " votes");
        System.out.println("Candidate B: " + c2 + " votes");
        System.out.println("Candidate C: " + c3 + " votes");
        System.out.println("Candidate D: " + c4 + " votes");
        int max = Math.max(Math.max(c1, c2), Math.max(c3, c4));
        System.out.print("Winner(s): ");
        if (c1 == max) System.out.print("Candidate A ");
        if (c2 == max) System.out.print("Candidate B ");
        if (c3 == max) System.out.print("Candidate C ");
        if (c4 == max) System.out.print("Candidate D ");
        sc.close();
    }
}

