package lab1.task1;

public class Data {
    // 3 private fields: 2 double, 1 int [cite: 13]
    private double sum;
    private double max;
    private int count;

    // Constructor [cite: 14]
    public Data() {
        this.sum = 0.0;
        this.count = 0;
        // Инициализируем минимальным значением, чтобы первый ввод стал максимумом
        this.max = -Double.MAX_VALUE; 
    }

    // Method to add value [cite: 15]
    public void addValue(double value) {
        sum += value;
        if (count == 0 || value > max) {
            max = value;
        }
        count++;
    }

    // Return average [cite: 16]
    public double getAverage() {
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }

    // Return largest [cite: 17]
    public double getLargest() {
        if (count == 0) {
            return 0.0; 
        }
        return max;
    }
}