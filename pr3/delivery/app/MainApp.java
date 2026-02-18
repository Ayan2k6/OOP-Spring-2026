package pr3.delivery.app;

import pr3.delivery.model.Car;
import pr3.delivery.model.Engine;
import pr3.delivery.model.Truck;
import pr3.delivery.model.Vehicle;
import pr3.delivery.service.DeliveryService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Создаем двигатели [cite: 51]
        Engine carEngine = new Engine("V6", 250);
        Engine truckEngine = new Engine("V8 Diesel", 500);

        // Создаем автомобили и грузовики [cite: 51]
        Car sedan = new Car("Toyota Camry", 100, carEngine, 5);
        Truck volvo = new Truck("Volvo FH", 300, truckEngine, 20000);

        // Список Vehicle [cite: 52]
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(sedan);
        fleet.add(volvo);

        // Тестируем сервис [cite: 52]
        DeliveryService service = new DeliveryService();

        service.printAllVehicles(fleet);
        System.out.println();
        
        service.calculateAllDeliveries(fleet);
        System.out.println();

        System.out.println("Total Fleet Delivery Cost: $" + service.calculateTotalCost(fleet));
        System.out.println();

        // Тест перегруженных методов (индивидуально, так как их нет в базовом классе Vehicle)
        System.out.println("--- Overloaded Methods Test ---");
        System.out.println("Car with extra weight (50kg): $" + sedan.calculateDeliveryCost(50));
        System.out.println("Truck delivery (100km, $1.5/km): $" + volvo.calculateDeliveryCost(100, 1.5));
    }
}