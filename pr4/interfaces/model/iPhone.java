package pr4.interfaces.model;

public class iPhone implements SellableAndPluggable {
    @Override
    public void sell() {
        System.out.println("iPhone is sold for $999.");
    }

    @Override
    public void plugIn() {
        System.out.println("iPhone is charging via Lightning/USB-C.");
    }
}
