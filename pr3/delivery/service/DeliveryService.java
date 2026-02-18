package pr3.delivery.service;

import pr3.delivery.model.Vehicle;
import java.util.List;

public class DeliveryService {

    // Вывод информации о всех машинах [cite: 48]
    public void printAllVehicles(List<Vehicle> vehicles) {
        System.out.println("--- All Vehicles ---");
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleInfo());
        }
    }

    // Расчет базовой доставки для всех [cite: 49]
    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        System.out.println("--- Basic Delivery Costs ---");
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getVehicleInfo());
            System.out.println("Cost: $" + v.calculateDeliveryCost());
        }
    }

    // Общая стоимость доставки (сумма) [cite: 50]
    public double calculateTotalCost(List<Vehicle> vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateDeliveryCost();
        }
        return total;
    }
}