package com.company;

import items.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Item phone1 = new Phone("Lenovo", 3499.0, "12Mp");
        Item phone2 = new Phone("Samsung", 3999.0,"16Mp");
        Item phone3 = new Phone("Xiaomi", 3000.0, "12Mp");
        Item notebook1 = new Notebook("Acer", 11999.0, "Intel Core I5");
        Item monitor1 = new Monitor("LG", 2700.0, 21);

        ArrayList<Item> itemList1 = new ArrayList<>();
        itemList1.add(phone1);
        itemList1.add(phone2);
        itemList1.add(phone3);
        itemList1.add(notebook1);
        itemList1.add(monitor1);

        Order order1 = new Order(OrderStatus.NEW, "25.11.2018", itemList1);

        Item notebook2 = new Notebook("Asus", 13999.0, "Intel Core I7");
        order1.add(notebook2);
        Item notebook3 = new Notebook("Lenovo", 12400.0, "AMD");
        order1.add(notebook3);
        Item monitor2 = new Monitor("Samsung", 4999.0, 25);
        order1.add(monitor2);
        Item monitor3 = new Monitor("Acer", 3600.0, 24);
        order1.add(monitor3);

        System.out.println(order1.getHeader());
        order1.printTable();
        System.out.println("Total: "+order1.totalPrice());
        System.out.println("Status: "+order1.getStatus());
    }
}
