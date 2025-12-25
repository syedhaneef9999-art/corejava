package net.konic.corejava.collections;

public class Pen {

    private String brandName;
    private String color;
    private double price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    public String toString() {
        return "Pen [brandName=" + brandName + ", color=" + color + ", price=" + price + "]";
    }
}