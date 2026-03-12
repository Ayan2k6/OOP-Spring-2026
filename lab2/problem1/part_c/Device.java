package lab2.problem1.part_c;

import java.util.Objects;

public class Device {
    private String brand;
    private String serialNumber;

    public Device(String brand, String serialNumber) {
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(brand, device.brand) && Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, serialNumber);
    }

    @Override
    public String toString() {
        return "Device{" + "brand='" + brand + '\'' + ", serialNumber='" + serialNumber + '\'' + '}';
    }
}
