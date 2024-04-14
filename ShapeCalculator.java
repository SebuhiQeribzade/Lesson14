package Compiletime;

 class ShapeCalculator {public double calculateArea(double length, double width) {
    return length * width;
}

    // Method to calculate area of circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of triangle
    public double calculateArea(double base, double height, String shape) {
        if(shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            System.out.println("Invalid shape provided.");
            return 0;
        }
    }
}


