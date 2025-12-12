class BankAccount {
    double currentbalance;

    public void deposit(double amount) {
        currentbalance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + currentbalance);
    }

    public void withdraw(double amount) {
        if (amount > currentbalance) {
            System.out.println("Insufficient balance");
        } else {
            currentbalance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + currentbalance);
        }
    }
}

// ================= SavingsAccount ===================
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        this.currentbalance = balance;
    }

    @Override
    public void withdraw(double amount) {
        double limit = 5000;  // example withdrawal limit

        if (amount > limit) {
            System.out.println("Savings withdrawal limit is " + limit);
        } else if (amount > currentbalance) {
            System.out.println("Insufficient balance");
        } else {
            currentbalance -= amount;
            System.out.println("Savings Withdrawal Successful!");
            System.out.println("New Balance: " + currentbalance);
        }
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Savings Account Deposit:");
        super.deposit(amount);
    }
}

// ================= CheckingAccount ===================
class CheckingAccount extends BankAccount {

    CheckingAccount(double balance) {
        this.currentbalance = balance;
    }

    @Override
    public void withdraw(double amount) {
        double fee = 50;  // withdrawal fee

        double total = amount + fee;
        if (total > currentbalance) {
            System.out.println("Insufficient balance (including fee)");
        } else {
            currentbalance -= total;
            System.out.println("Checking Withdrawal Successful!");
            System.out.println("Fee charged: " + fee);
            System.out.println("New Balance: " + currentbalance);
        }
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Checking Account Deposit:");
        super.deposit(amount);
    }
}

// ================= MAIN CLASS ===================
public class Day2 {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(1000);
        s1.deposit(500);
        s1.withdraw(300);

        System.out.println("---------------------");

        CheckingAccount c1 = new CheckingAccount(2000);
        c1.deposit(1000);
        c1.withdraw(500);
    }
}
