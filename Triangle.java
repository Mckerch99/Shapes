package Shapes;


/**
 *
 * @author Liam
 */

import static java.lang.Math.sqrt;

//creating a Triangle class that extends the super class GeometricObject
public class Triangle extends GeometricObject {

    try {
            //if all the sides follow the rules of making a triangle then the triangle object will be created.
            if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
                //otherwise if the sides dont follow the rules a new ArithmeticException will be thrown with the message "Invalid Sides; cannot create the triangle object!"
            } else {
                throw new ArithmeticException("Invalid Sides; cannot create the triangle object!");
            }
            //This with catch the newly thrown ArithmeticException and then throw the Exception back out again
        } catch (ArithmeticException e) {
            throw e;

        }

    public Triangle() {

    }
   
    //assigning sides 1, 2, and 3 to this.side (1,2,3)
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //getting and setting the sides 1, 2, and 3
    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side1 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side1 = side3;
    }

    //a method to do the calculations to get the area of the triangle
    public double getArea() {
        double s = this.side1 + this.side2 + this.side3;
        double a = sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
        return a;
    }

    //a method to do the calculations to get the perimeter
    public double getPerimeter() {
        double p = side1 + side2 + side3;
        return p;
    }

    //overriding the toString class from the super class
    //making a toString class to output the sides of the triangle as well as the toString class from the super class
    @Override
    public String toString() {
        return super.toString() + "With side one being " + this.getSide1() + ", side two being " + this.getSide2() + ", and side three vbeing " + this.getSide3();
    }

}
