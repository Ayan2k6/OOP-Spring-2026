package lab2.problem4;

public class Parallel extends Circuit {
    private Circuit a;
    private Circuit b;
    private double potentialDifference;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return 1.0 / ((1.0 / a.getResistance()) + (1.0 / b.getResistance()));
    }

    @Override
    public double getPotentialDiff() {
        return this.potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
