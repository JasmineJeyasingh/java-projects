package com.lc101.jasmine.studios.restaurantmenu;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
    @Override
    public String toString() {
        String output = "";
        output += this.name + "\n" + this.price + "\n" + this.category + "\n" + this.isNew;
        return output;
    }
}
