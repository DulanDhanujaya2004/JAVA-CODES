
import java.util.Scanner;

class Membership {
    void monthlyFee(int months) {
        
    }
}


class BasicMembership extends Membership {
    int feePerMonth = 1500;

    @Override
    void monthlyFee(int months) {
        if (months < 1) {
            System.out.println("Invalid duration");
        } else {
            int total = feePerMonth * months;
            System.out.println("Basic Membership Fee for " + months + " months = Rs." + total);
        }
    }
}


class PremiumMembership extends Membership {
    int feePerMonth = 3000;

    @Override
    void monthlyFee(int months) {
        if (months < 1) {
            System.out.println("Invalid duration");
        } else {
            int total = feePerMonth * months;
            System.out.println("Premium Membership Fee for " + months + " months = Rs." + total);
        }
    }
}


public class p4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        Membership m1 = new BasicMembership();
        Membership m2 = new PremiumMembership();

        m1.monthlyFee(months);
        m2.monthlyFee(months);

        sc.close();
    }
}
