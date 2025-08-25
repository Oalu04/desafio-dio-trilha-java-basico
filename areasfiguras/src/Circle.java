public record Circle(double radius) implements GeometricForm {
    private static double pi = 3.14;

    
    public double getArea() {

        return pi * (radius * radius);
    }
}
