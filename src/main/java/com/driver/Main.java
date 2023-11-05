package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a CurrentAccount
            CurrentAccount currentAccount = new CurrentAccount("John", 6000, "ABCDEFF");
            System.out.println("Current Account created");

            // Validating the trade license ID
            currentAccount.validateLicenseId();
            System.out.println("Trade License ID validated: " + currentAccount.getTradeLicenseId());

            // Creating a SavingsAccount
            SavingsAccount savingsAccount = new SavingsAccount("Alice", 10000, 2000, 0.05);
            System.out.println("Savings Account created");

            // Depositing and withdrawing from the SavingsAccount
            savingsAccount.deposit(2000);
            System.out.println("Deposited 2000. New balance: " + savingsAccount.getBalance());

            savingsAccount.withdraw(1500);
            System.out.println("Withdrawn 1500. New balance: " + savingsAccount.getBalance());

            // Calculating interest in the SavingsAccount
            double simpleInterest = savingsAccount.getSimpleInterest(3);
            System.out.println("Simple Interest after 3 years: " + simpleInterest);

            double compoundInterest = savingsAccount.getCompoundInterest(4, 3);
            System.out.println("Compound Interest after 3 years (4 times per year): " + compoundInterest);

            // Creating a StudentAccount
            StudentAccount studentAccount = new StudentAccount("Bob", 500, "XYZ University");
            System.out.println("Student Account created");

            // Generating an account number
            String accountNumber = studentAccount.generateAccountNumber(8, 36);
            System.out.println("Generated Account Number: " + accountNumber);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}