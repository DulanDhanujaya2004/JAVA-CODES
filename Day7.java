
import java.util.Scanner;
class Appliance{
    int power;
   void  calculateUsage(int hours){
    

    }

}
class Fan extends Appliance{
  Fan(){
    power=75;

  }
      @Override
      void  calculateUsage(int hours){
         double unit= (power*hours) / 1000;
         System.out.println("Fan power consumption is:"+unit);

      }
   
}
class AirConditioner extends Appliance{
        AirConditioner(){
            power=1500;
        }
     
    @Override
    void calculateUsage(int hours){
    double unit= (power*hours) / 1000;
    System.out.println("AirConditioner power consumption is :"+unit);
    }
     }


public class p3{
    public static void main (String []args){
        Fan f2=new Fan ();
        AirConditioner  a2=new AirConditioner ();
         
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter hours of usage:");
        int hours=s1.nextInt();


       Appliance f1=new Fan();
       Appliance a1=new AirConditioner();

        f1.calculateUsage(hours);
        a1.calculateUsage(hours);

       
    }
}
