package lab2.problem1.part_c;

import java.util.Objects;

public class Laptop extends Device {
    private int ramSize;

    public Laptop(String brand, String serialNumber, int ramSize) {
        super(brand, serialNumber);
        this.ramSize = ramSize;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return ramSize == laptop.ramSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ramSize);
    }

    @Override
    public String toString() {
        return "Laptop{" + super.toString() + ", ramSize=" + ramSize + "GB}";
    }
}