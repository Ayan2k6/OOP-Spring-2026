package lab3.problem2;

public class Eagle implements Flyable {
    @Override public void move() { System.out.println("Hopping"); }
    @Override public void fly() { System.out.println("Flying high"); }
}