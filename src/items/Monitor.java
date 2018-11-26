package items;

public class Monitor extends Item {

    private int screenSize;

    public Monitor(String name, double price, int screenSize) {
        super(name, price);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name=" + name +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }
}
