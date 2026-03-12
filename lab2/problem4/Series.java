package lab2.problem4;

public class Series extends Circuit {
    private Circuit a;
    private Circuit b;
    private double potentialDifference;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return this.potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        
        double current = V / getResistance();
        
        a.applyPotentialDiff(current * a.getResistance());
        b.applyPotentialDiff(current * b.getResistance());
    }
}