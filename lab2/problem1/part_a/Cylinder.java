package lab2.problem1.part_a;

public class Cylinder extends Shape3D {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
}
