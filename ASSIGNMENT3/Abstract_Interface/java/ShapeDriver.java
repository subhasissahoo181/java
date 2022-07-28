//ASSIGNMENT-5
/*Q1.Define an abstract class named as Shape, having data members dimOne ( type
is double ) and dimTwo( type is double ) and one abstract methods double
computeArea(). Extend this class to create two concrete classes named as
Rectangle and Triangle. Override the computeArea() method in the sub classes.
Invoke the computeArea() method in the main method of another Driver class
through an abstract class reference variable. Use default and parameterized
constructor*/

package Abstract_Interface.java;

 abstract class Shape {
    double dimOne;
    double dimTwo;
    Shape(double a,double b){
        dimOne = a;
        dimTwo = b;
    }
    public abstract double computeArea();
}
    class Rectangle extends Shape{
        Rectangle(double a,double b){
            super(a,b);
        }
        public double computeArea(){
            return dimOne*dimTwo;
        }
    }
    class Triangle extends Shape{
        Triangle(double a,double b){
            super(a,b);
        }
        public double computeArea(){
            return dimOne*dimTwo/2;
        }
    }
    
    public class ShapeDriver{
        public static void main(String[] args){
            Shape s;
            Rectangle r1 =new Rectangle(10.0,20.0);
            s = r1;
            System.out.println("Area of the rectangle is : "+s.computeArea());
            Triangle t1 = new Triangle(10.0,20.0);
            s = t1;
            System.out.println("Area of the triangle is : "+s.computeArea());
        }
    }


