import java.util.Scanner;

public class LoanEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input salary and citizenship status
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Are you a citizen of INDIA? (yes/no): ");
        String citizenship = scanner.next();
        
        // Check eligibility
        if (salary > 50000 && citizenship.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations! You are eligible for a loan.");
        } else {
            System.out.println("Sorry, you are not eligible for a loan.");
        }
        
        scanner.close();
    }
}

/*
C:\Users\NAGESH\OneDrive\Desktop\Java-practice>java LoanEligibilityChecker
Enter salary: 51000
Are you a citizen of INDIA? (yes/no): yes
Congratulations! You are eligible for a loan.*/