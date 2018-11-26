package items;

public class Notebook extends Item {

    private String processor;

    public Notebook(String name, double price, String processor) {
        super(name, price);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name=" + name +
                ", price=" + price +
                ", processor=" + processor +
                '}';
    }
}
