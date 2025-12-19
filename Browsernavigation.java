import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class Browsernavigation {
    static Stack<String> backStack = new Stack<>();
    static Stack<String> forwardStack = new Stack<>();
    static ArrayList<String> history = new ArrayList<>();
    static String currentPage = "Home";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== SIMPLE BROWSER MENU =====");
            System.out.println("Current Page: " + currentPage);
            System.out.println("1. Go to Website");
            System.out.println("2. Backward");
            System.out.println("3. Forward");
            System.out.println("4. View History");
            System.out.println("5. Search in History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline]
            switch (choice) {
                case 1:
                    System.out.print("Enter website URL: ");
                    String url = sc.nextLine();
                    goToWebsite(url);
                    break;
                case 2:
                    goBackward();
                    break;
                case 3:
                    goForward();
                    break;
                case 4:
                    showHistory();
                    break;
                case 5:
                    System.out.print("Enter website to search: ");
                    String search = sc.nextLine();
                    searchHistory(search);
                    break;
                case 6:
                    System.out.println("Exiting browser...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
    static void goToWebsite(String url) {
        backStack.push(currentPage);
        currentPage = url;
        history.add(url);
        forwardStack.clear();
        System.out.println("Opened: " + url);
    }
    static void goBackward() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Moved back to: " + currentPage);
        } else {
            System.out.println("No page to go back!");
        }
    }
    static void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Moved forward to: " + currentPage);
        } else {
            System.out.println("No page to go forward!");
        }
    }
    static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No browsing history!");
        } else {
            System.out.println("Browsing History:");
            for (String site : history) {
                System.out.println("- " + site);
            }
        }
    }
    static void searchHistory(String site) {
        if (history.contains(site)) {
            System.out.println(site + " found in history.");
        } else {
            System.out.println(site + " not found in history.");
        }
    }
}