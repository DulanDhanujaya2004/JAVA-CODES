class product{
    private int price =1000;
    private int productcode =101;
    private String productName ="pizza";


public int getprice(){
    return price;
}

public int getproductcode(){
    return productcode;

}public String  getproductName(){

    return productName;

}
public void set(int price,int productcode,String productName){
    this.price = price;
    this.productcode = productcode ;
    this.productName = productName;
}}
class p12 extends product{
    public void applyDiscount(){
        int price=getprice();
        double discount=price*5/100.0;
        price-=discount;
        System.out.println("after discount : " + price);
    }
    public static void main(String []args){
        p12 p= new p12();
        p.set(1000,101,"pizza");
        System.out.println("product price : "+p.getprice());
         System.out.println("product code : "+p. getproductcode());
          System.out.println("product name : "+p. getproductName());
          p.applyDiscount();
          

    }
}
