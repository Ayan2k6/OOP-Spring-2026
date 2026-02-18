package pr3.delivery.model;

public class Engine {
    private String type;
    private double horsePower;

    // Конструктор [cite: 24]
    public Engine(String type, double horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    // Согласно диаграмме возвращает void (печатает инфо) [cite: 30]
    public void getEngineInfo() {
        System.out.println("Engine Type: " + type + ", HP: " + horsePower);
    }
    
    // Геттеры нужны для использования информации внутри Vehicle (подсказка )
    public String getType() { return type; }
    public double getHorsePower() { return horsePower; }
}