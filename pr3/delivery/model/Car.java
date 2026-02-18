package pr3.delivery.model;

public class Car extends Vehicle {
    private int numberOfSeats;

    // Конструктор использует super(...) [cite: 43]
    public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    // Переопределение базового расчета [cite: 44]
    @Override
    public double calculateDeliveryCost() {
        // Пример логики: базовая стоимость + налог за места
        return baseCost + (numberOfSeats * 10.0);
    }

    // Перегрузка метода (Overload) с extraWeight [cite: 44]
    public double calculateDeliveryCost(double extraWeight) {
        return calculateDeliveryCost() + (extraWeight * 2.5);
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", Seats: " + numberOfSeats;
    }
}