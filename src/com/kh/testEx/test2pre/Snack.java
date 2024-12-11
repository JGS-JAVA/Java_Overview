package com.kh.testEx.test2pre;

public class Snack {
    private String name;
    private String flavor;
    private int price;

    public Snack() {
    }

    public Snack(String name, String flavor, int price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }
}