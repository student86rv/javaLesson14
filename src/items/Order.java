package items;

import java.util.ArrayList;

public class Order {

    private OrderStatus status;
    private String orderDate;
    private ArrayList<Item> items;

    public Order(OrderStatus status, String orderDate, ArrayList items) {
        this.status = status;
        this.orderDate = orderDate;
        this.items = items;
    }

    public void add(Item newItem) {
        items.add(newItem);
    }

    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice();
        }
        setStatus(OrderStatus.PAID);
        return total;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public String getHeader() {
        return "Order{status=" + status +
                ", date=" + orderDate +
                "}";
    }

    public void printTable() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(""+items.get(i));
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", orderDate='" + orderDate +
                ", items=" + items +
                '}';
    }
}
