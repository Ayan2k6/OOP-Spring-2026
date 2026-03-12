package lab2.problem4;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);

        double R = circuit.getResistance();
        System.out.println("Эквивалентное сопротивление (R): " + R + " Ом");

        circuit.applyPotentialDiff(24.0);
        
        System.out.println("Общий ток в цепи (I): " + circuit.getCurrent() + " А");
        System.out.println("Общая рассеиваемая мощность (P): " + circuit.getPower() + " Вт");
        
        System.out.println("\nТок через резистор R3 (6 Ом): " + r3.getCurrent() + " А");
        System.out.println("Напряжение на резисторе R1 (7 Ом): " + r1.getPotentialDiff() + " В");
    }
}