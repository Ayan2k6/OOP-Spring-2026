package lab2.problem1.part_a;

public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}