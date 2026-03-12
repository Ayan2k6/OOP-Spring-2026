package lab2.problem1.part_a;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double r) {
        this.radius = r;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}