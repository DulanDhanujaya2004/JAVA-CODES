
class Shape{
     double getArea(){
       return 0;
     }
     double getPerimeter(){
        return 0;
     }}
     
class Circle extends Shape {
    double r;
    double pi=3.14;

    Circle(double r){
        this.r=r;
    }
    @Override
    double getArea(){
        return pi*r*r;
    }
    @Override
    double getPerimeter(){
      return 2*pi*r;

}}

class Rectangle extends Shape{
    double l,w;
    double pi=3.14;
    Rectangle(double l,double w){
        this.l=l;
        this.w=w;
    }
    @Override
    double getArea(){
        return l*w;

    }
    @Override
    double getPerimeter(){
         return 2*(l+w);
    }

}
   
class Triangle extends Shape{
    double a,b,c,h;
    double d=0.5;
    Triangle(double a,double b,double c,double h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }
    @Override
    double getArea(){
        return d*b*h;
    }
    @Override
    double getPerimeter(){
        return a+b+c;
    }
}
class Square extends Shape{
    double a;
    Square(double a){
        this.a=a;
    }
    @Override
    double getArea(){
        return a*a;

    }
    @Override
    double getPerimeter(){
        return 4*a;
    }
}
public class p1{
    public static void main(String []args){
        Circle c=new Circle(4);
        Rectangle r=new Rectangle(4,5);
        Triangle t=new Triangle(4,5,6,7);
        Square s=new Square(4);

        System.out.println("Circle Area is : "+c.getArea());
        System.out.println("Circle Perimeter is : "+c.getPerimeter());

        System.out.println("Rectangle Area is : "+r.getArea());
          System.out.println("Rectangle Perimeter is : "+r.getPerimeter());

        System.out.println("Triangle Area is : "+t.getArea());
        System.out.println("Triangle Perimeter is : "+t.getPerimeter());

        System.out.println("Square Area is : "+s.getArea());
        System.out.println(" Square Perimeter is : "+s.getPerimeter());

}}




