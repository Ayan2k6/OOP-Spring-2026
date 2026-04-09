package lab3.problem1;

public abstract class Device {
    protected String brand;
    public Device(String brand) { this.brand = brand; }
    public abstract void turnOn();
}