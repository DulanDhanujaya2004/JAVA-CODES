class Shape {
    public void getArea() {
        System.out.println("Area not defined!");
    }

    public void getPerimeter() {
        System.out.println("Perimeter not defined!");
    }
}

// ---------------------- Circle -------------------------
class Circle extends Shape {
    double r;
    double pi = 3.14;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        double Area = pi * r * r;
        System.out.println("Circle Area: " + Area);
    }

    @Override
    public void getPerimeter() {
        double Perimeter = 2 * pi * r;
        System.out.println("Circle Perimeter: " + Perimeter);
    }
}

// ---------------------- Triangle -------------------------
class Triangle extends Shape {
    int a, b, c, h;

    Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void getArea() {
        double Area = 0.5 * b * h;
        System.out.println("Triangle Area: " + Area);
    }

    @Override
    public void getPerimeter() {
        int Perimeter = a + b + c;
        System.out.println("Triangle Perimeter: " + Perimeter);
    }
}

// ---------------------- Square -------------------------
class Square extends Shape {
    int a;

    Square(int a) {
        this.a = a;
    }

    @Override
    public void getArea() {
        int Area = a * a;
        System.out.println("Square Area: " + Area);
    }

    @Override
    public void getPerimeter() {
        int Perimeter = 4 * a;
        System.out.println("Square Perimeter: " + Perimeter);
    }
}

// ---------------------- Rectangle -------------------------
class Rectangle extends Shape {
    int w, l;

    Rectangle(int w, int l) {
        this.w = w;
        this.l = l;
    }

    @Override
    public void getArea() {
        int Area = w * l;
        System.out.println("Rectangle Area: " + Area);
    }

    @Override
    public void getPerimeter() {
        int Perimeter = 2 * (w + l);
        System.out.println("Rectangle Perimeter: " + Perimeter);
    }
}

// ---------------------- Main Class -------------------------
public class Day1 {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        c1.getArea();
        c1.getPerimeter();

        Triangle t1 = new Triangle(3, 4, 5, 6);
        t1.getArea();
        t1.getPerimeter();

        Square s1 = new Square(4);
        s1.getArea();
        s1.getPerimeter();

        Rectangle r1 = new Rectangle(4, 8);
        r1.getArea();
        r1.getPerimeter();
    }
}
