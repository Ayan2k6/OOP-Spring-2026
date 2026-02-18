package pr3.delivery.model;

public class Truck extends Vehicle {
    private int maxLoad;

    // Конструктор использует super(...) [cite: 45]
    public Truck(String model, double baseCost, Engine engine, int maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    // Переопределение базового расчета [cite: 46]
    @Override
    public double calculateDeliveryCost() {
        // Пример логики: базовая стоимость + наценка за грузоподъемность
        return baseCost + (maxLoad * 0.5);
    }

    // Перегрузка метода (Overload) с distance и fuelPrice [cite: 46]
    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return calculateDeliveryCost() + (distance * fuelPrice);
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", Max Load: " + maxLoad + "kg";
    }
}