package lab3.problem1;

public class Smartphone extends Device {
    public Smartphone(String brand) { super(brand); }
    @Override public void turnOn() { System.out.println("Smartphone on"); }
}