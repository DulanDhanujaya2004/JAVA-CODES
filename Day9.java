
import java.util.Scanner;


class Parcel {
    void calculateCharge(int distance) {
       
    }
}


class LocalParcel extends Parcel {
    double weight = 5.0;          
    double ratePerKm = 20.0;     
    @Override
    void calculateCharge(int distance) {
        double charge = weight * ratePerKm * distance;
        System.out.println("Local Parcel Delivery Charge = Rs." + charge);
    }
}


class InternationalParcel extends Parcel {
    double weight = 5.0;        
    double ratePerKm = 50.0;     

    @Override
    void calculateCharge(int distance) {
        double charge = weight * ratePerKm * distance;
        System.out.println("International Parcel Delivery Charge = Rs." + charge);
    }
}


public class p5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter delivery distance (km): ");
        int distance = sc.nextInt();

        Parcel p1 = new LocalParcel();
        Parcel p2 = new InternationalParcel();

        p1.calculateCharge(distance);
        p2.calculateCharge(distance);

        sc.close();
    }
}
