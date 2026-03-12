package lab2.problem1.part_c;

import java.util.HashSet;

public class MainTest {
    public static void main(String[] args) {
        HashSet<Device> inventory = new HashSet<>();

        Device d1 = new Device("Samsung", "SN-1001");
        Device d2 = new Device("Samsung", "SN-1001");

        Laptop l1 = new Laptop("Dell", "SN-2002", 16);
        Laptop l2 = new Laptop("Dell", "SN-2002", 16);
        Laptop l3 = new Laptop("Dell", "SN-2002", 32);

        inventory.add(d1);
        inventory.add(d2);
        inventory.add(l1);
        inventory.add(l2);
        inventory.add(l3);

        System.out.println("Количество уникальных устройств: " + inventory.size());
        for (Device device : inventory) {
            System.out.println(device);
        }
    }
}
