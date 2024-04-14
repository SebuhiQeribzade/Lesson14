package Compiletime;

public class ShapeCalculatorMain  {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        // Calculate area of rectangle
        double rectangleArea = calculator.calculateArea(5, 4);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate area of circle
        double circleArea = calculator.calculateArea(3);
        System.out.println("Area of circle: " + circleArea);

        // Calculate area of triangle
        double triangleArea = calculator.calculateArea(4, 3, "triangle");
        System.out.println("Area of triangle: " + triangleArea);
    }
}


