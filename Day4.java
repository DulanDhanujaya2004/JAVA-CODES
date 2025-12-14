class BankAccount {
    String customerName;
    char accountType;   // 'S' or 'F'
    double balance;

    BankAccount(String name, char type, double balance) {
        this.customerName = name;
        this.accountType = type;
        this.balance = balance;
    }

    double calculateInterest() {
        double interestRate = 0;

        if (accountType == 'S') { // Savings
            if (balance >= 50000)
                interestRate = 0.05;
            else if (balance >= 20000)
                interestRate = 0.04;
            else
                interestRate = 0.03;
        } 
        else if (accountType == 'F') { // Fixed Deposit
            if (balance >= 100000)
                interestRate = 0.07;
            else if (balance >= 50000)
                interestRate = 0.06;
            else
                interestRate = 0.05;
        }

        return balance * interestRate;
    }

    void displayDetails() {
        double interest = calculateInterest();
        double total = balance + interest;

        System.out.println("---- Customer " + customerName + " ----");
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance      : " + balance);
        System.out.println("Interest     : " + interest);
        System.out.println("Total Amount : " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John", 'S', 55000);
        acc1.displayDetails();
    }
}
