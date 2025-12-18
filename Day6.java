
import java.util.Scanner;
class BankAccount{
   double currentbalance;
    BankAccount( double currentbalance){
        this.currentbalance=currentbalance;
    }
 
  void deposit(){

  }
  void withdraw(){

  }
}

class SavingAccount extends  BankAccount{
    SavingAccount(double currentbalance){
        super(currentbalance);
    }
    @Override
    void deposit(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter deposit saving amount:");
        double newamount=s1.nextDouble();
        currentbalance+=newamount;
        System.out.println("new balance:"+currentbalance);
    }
       
     @Override  

      void withdraw(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter withdraw saving amount:");
        double newamount=s1.nextDouble();
        if(newamount>currentbalance){
            System.out.println("Insufficient balance");
        }
        else{
            currentbalance-=newamount;
            System.out.println("new balance:"+currentbalance);
        }

      }
    }


class CheckingAccount extends BankAccount{
     final double fee = 50;
     CheckingAccount(double currentbalance){
        super( currentbalance);
    }
    @Override
    void deposit(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter checking withdraw :");
        double newamount=s1.nextDouble();

        currentbalance+=newamount;
        System.out.println("new balance:"+currentbalance);
    }
    @Override
    void withdraw(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter withdraw check accoun:");
        double newamount=s1.nextDouble();

        if(newamount+fee>currentbalance){
            System.out.println("Insufficient balance");
        }
        else{
            currentbalance-=newamount+fee;
            System.out.println("withdraw fee:"+fee);
            System.out.println("new balance:"+currentbalance);
        }

    }

} 
public class p2{
    public static void main(String[] args) {
        SavingAccount s2=new   SavingAccount(1000);
        CheckingAccount s3=new CheckingAccount(1500);
        s2.deposit();;
        s3.withdraw();
    }
}
