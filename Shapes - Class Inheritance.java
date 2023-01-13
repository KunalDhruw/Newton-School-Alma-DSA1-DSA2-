/*
Shapes - Class Inheritance
easy


Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Complete the Main class. Implement the getArea() and getPerimeter() methods for the child classes Parallelogram, Rhombus, Rectangle, and Square having Abstract class Quadrilateral as a parent class.


Do not change the name of any class
Input
The first line of input contains side1, side2 and height of the parallelogram
The second line of input contains side and height of rhombus
The third line of input contains length and height of the rectangle
The fourth line of input contains side of square

If the length of any side or height for any shape is negative, then print Length of a side cannot be negative. Please Enter a positive integer.
Output
"Perimeter of Parallelogram is " + parallelogram.getPerimeter() +" and Area of Parallelogram is " + parallelogram.getArea()
"Perimeter of Rhombus is " + rhombus.getPerimeter() +" and Area of Rhombus is " + rhombus.getArea()
"Perimeter of Rectangle is " + rectangle.getPerimeter() +" and Area of Rectangle is " + rectangle.getArea()
"Perimeter of Square is " + square.getPerimeter()+ " and Area of Square is " + square.getArea()



Example
Sample Input 1:
1.0 2.0 3.0
7.0 5.0
4.0 2.0
6.0

Sample Output 2:
Perimeter of Parallelogram is 6.0 and Area of Parallelogram is 3.0

Perimeter of Rhombus is 28.0 and Area of Rhombus is 35.0

Perimeter of Rectangle is 12.0 and Area of Rectangle is 8.0

Perimeter of Square is 24.0 and Area of Square is 36.0


Sample Input 2:
3.0 9.0 7.0
6.0 4.0
-1.0 5.0
8.0

Sample Output 2:
Length of a side cannot be negative. Please Enter a positive integer

*/



import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

//    public Quadrilateral(double side1, double side2, double side3, double side4) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//        this.side4 = side4;
//    }

    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1 + side2 + side3 + side4);
    }
}

// Implement class Parallelogram and methods getArea() and getPerimeter()
class Parallelogram extends Quadrilateral {
    double pside1;
    double pside2;
    double height;

    public Parallelogram(double pside1, double pside2, double height) {
        this.pside1 = pside1;
        this.pside2 = pside2;
        this.height = height;
    }

    public Parallelogram(double pside1, double pside2) {
        this.pside1 = pside1;
        this.pside2 = pside2;
    }

    public Parallelogram(double pside1) {
        this.pside1 = pside1;
    }

    @Override
    protected double getArea() {
        double area = pside1 * height;
        return area;
    }

    @Override
    protected double getPerimeter() {
        double perimeter = 2 * (pside1 + pside2);
        return perimeter;
    }
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Parallelogram {
    public Rhombus(double pside1, double pside2) {
        super(pside1, pside2);
    }

    public Rhombus(double pside1) {
        super(pside1);
    }

    @Override
    protected double getArea() {
        double area = pside1 * pside2;
        return area;
    }

    @Override
    protected double getPerimeter() {
        double perimeter = 4 * pside1;
        return perimeter;
    }
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Parallelogram {
    public Rectangle(double pside1, double pside2) {
        super(pside1, pside2);
    }

    @Override
    protected double getArea() {
        double area = pside1 * pside2;
        return area;
    }

    @Override
    protected double getPerimeter() {
        double perimeter = 2 * (pside1 + pside2);
        return perimeter;
    }
}

//Implement class Square and methods getArea() and getPerimeter()
class Square extends Rhombus {
    public Square(double pside1) {
        super(pside1);
    }

    @Override
    protected double getArea() {
        double area = pside1 * pside1;
        return area;
    }

    @Override
    protected double getPerimeter() {
        double perimeter = 4 * pside1;
        return perimeter;
    }
}


// Do not edit the Main class
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parallelogram p = new Parallelogram(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        Rhombus r = new Rhombus(sc.nextDouble(), sc.nextDouble());
        Rectangle rec = new Rectangle(sc.nextDouble(), sc.nextDouble());
        Square S = new Square(sc.nextDouble());

        if (p.pside1 < 0 || p.pside2 < 0 || p.height < 0 || r.pside1 < 0 || r.pside2 < 0 || rec.pside1 < 0 || rec.pside2 < 0 || S.pside1 < 0) {
            System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
        } else {
            System.out.println("Perimeter of Parallelogram is " + p.getPerimeter() + " and Area of Parallelogram is " + p.getArea());
            System.out.println("Perimeter of Rhombus is " + r.getPerimeter() + " and Area of Rhombus is " + r.getArea());
            System.out.println("Perimeter of Rectangle is " + rec.getPerimeter() + " and Area of Rectangle is " + rec.getArea());
            System.out.println("Perimeter of Square is " + S.getPerimeter() + " and Area of Square is " + S.getArea());
        }
        sc.close();
    }
}
