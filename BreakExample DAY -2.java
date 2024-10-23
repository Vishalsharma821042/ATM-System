import java.util.Scanner;

public class UserBalanceManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.println("Choose an action: (insert, update, delete, fetch, exit)");
            input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            switch (input.toLowerCase()) {
                case "insert":
                    System.out.println("Inserting record...");
                    // Call your insert method here
                    break; 
                case "update":
                    System.out.println("Updating record...");
                    // Call your update method here
                    break;
                case "delete":
                    System.out.println("Deleting record...");
                    // Call your delete method here
                    break;
                case "fetch":
                    System.out.println("Fetching records...");
                    // Call your fetch method here
                    break;
                default:
                    System.out.println("Invalid action.");
                    break;
            }
        }
        
        scanner.close();
        System.out.println("Exited.");
    }
}
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }
    }
}
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip the current iteration when i is 5
            }
            System.out.println(i);
        }
    }
}
public class BreakInWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 6) {
                break; // Exit the loop when i is 6
            }
            System.out.println(i);
            i++;
        }
    }
}
public class ContinueInWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 6) {
                i++;
                continue; // Skip the current iteration when i is 6
            }
            System.out.println(i);
            i++;
        }
    }
}
