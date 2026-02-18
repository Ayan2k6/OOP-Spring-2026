package lab1.task3;

public class Temperature {
    private double temperature;
    private char scale; // 'C' or 'F' [cite: 36]

    // Constructors [cite: 38-43]
    
    // 1. Two parameters
    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    // 2. Default (0 degrees C)
    public Temperature() {
        this(0, 'C');
    }

    // 3. Value only (assume Celsius)
    public Temperature(double temperature) {
        this(temperature, 'C');
    }

    // 4. Scale only (assume 0 degrees)
    public Temperature(char scale) {
        this(0, scale);
    }

    // Methods Type 1: Return temperature [cite: 46]
    public double getDegreesC() {
        if (scale == 'C') {
            return temperature;
        } else {
            // Formula: 5(F-32)/9 [cite: 48]
            return 5 * (temperature - 32) / 9.0;
        }
    }

    public double getDegreesF() {
        if (scale == 'F') {
            return temperature;
        } else {
            // Formula: 9(C/5) + 32 [cite: 49]
            return (9 * (temperature / 5.0)) + 32;
        }
    }

    // Methods Type 2: Setters [cite: 50]
    public void setValue(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setValueAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    // Methods Type 3: Return scale [cite: 52]
    public char getScale() {
        return scale;
    }
}