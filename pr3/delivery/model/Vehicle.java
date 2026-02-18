package pr3.delivery.model;

public abstract class Vehicle {
    protected String model;
    protected double baseCost;
    protected Engine engine; // Композиция: Vehicle has an Engine [cite: 25]

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    // Абстрактный или базовый метод расчета (согласно заданию - basic implementation) [cite: 26]
    public double calculateDeliveryCost() {
        return baseCost;
    }

    // Возвращает строковую информацию, включая данные двигателя 
    public String getVehicleInfo() {
        return "Model: " + model + ", Base Cost: " + baseCost + 
               ", Engine: [" + engine.getType() + " (" + engine.getHorsePower() + " hp)]";
    }
}