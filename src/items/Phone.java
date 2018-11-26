package items;

public class Phone extends Item {

    private String camera;

    public Phone(String name, double price, String camera) {
        super(name, price);
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

   @Override
    public String toString() {
        return "Phone{" +
                "name=" + name +
                ", price=" + price +
                ", camera=" + camera +
                '}';
    }
}
