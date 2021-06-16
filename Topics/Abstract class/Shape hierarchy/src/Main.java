abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();

}

class Triangle extends Shape {

    double sideA = 0.0;

    double sideB = 0.0;

    double sideC = 0.0;

    double areaOfTriangle = 0.0;

    double perimeterOfTriangle = 0.0;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //  Area=SQRT(s(s-a)(s-b)(s-c))

    @Override
    double getPerimeter() {
        this.perimeterOfTriangle = this.sideA + this.sideB + this.sideC;
        return this.perimeterOfTriangle;
    }

    @Override
    double getArea() {
        double s = (this.sideA + this.sideB + this.sideC) / 2;
        this.areaOfTriangle = Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
        return this.areaOfTriangle;
    }
}

class Rectangle extends Shape {

    double width = 0.0;

    double length = 0.0;

    double perimeterOfRectangle = 0.0;

    double areaOfRectangle = 0.0;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getPerimeter() {
        this.perimeterOfRectangle = 2 * (this.length + this.width);
        return this.perimeterOfRectangle;
    }

    @Override
    double getArea() {
        this.areaOfRectangle = this.width * this.length;
        return this.areaOfRectangle;
    }
}

class Circle extends Shape {

    double radius = 0.0;

    double areaOfCircle = 0.0;

    double perimeterOfCircle = 0.0;

    public Circle(double radius) {
        this.radius = radius;
    }


//double perimeterOfCircle = 0.0;

    @Override
    double getPerimeter() {
        this.perimeterOfCircle = (2 * Math.PI) * this.radius;
        return this.perimeterOfCircle;
    }

    @Override
    double getArea() {
        this.areaOfCircle = Math.PI * (this.radius * this.radius);
        return this.areaOfCircle;
    }
}
//
//class Main {
//
//    public static void main(String[] args) {
//
//        Circle myCircle = new Circle(10);
//        System.out.println(myCircle.getPerimeter() + " and " + myCircle.getArea());
//
//        Triangle myTriangle = new Triangle(3, 4, 5);
//        System.out.println(myTriangle.getPerimeter() + " and " + myTriangle.getArea());
//
//        Rectangle myRectangle = new Rectangle(5, 10);
//        System.out.println(myRectangle.getPerimeter() + " and "  + myRectangle.getArea());
//    }
//}
