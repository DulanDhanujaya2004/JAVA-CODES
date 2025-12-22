class vehicle{
     private int price = 2000000000;
     private String brand = "Benz";
     private  String colour = "Black";

     public int getprice(){
        return price;
    }
     
    public String getbrand(){
        return brand;

    }
    
    public String getcolour(){
        return colour;
    } 
    public void set(int price,String brand,String colour){
        
        this.price = price;
        this.brand = brand;
        this.colour = colour;
    }}
    class p45 extends vehicle{
    public void car(){
        int price=getprice();
        double discount=price*5/100.0;
        price-=discount;
        System.out.println("after discount : " + price);
    }
     public static void main(String []args){
        p45 d= new p45();
        d.set(2000000000,"Benz","Black");
         System.out.println("vehicle price : "+d. getprice());
        System.out.println("vehicle brand : "+d.getbrand());
          System.out.println("vehicle name : "+d. getcolour());
          d.car();
}
}
