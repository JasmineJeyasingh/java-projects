package com.lc101.jasmine.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItem = new ArrayList<>();
    private String  dateUpdated;

    public Menu(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }
//    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    @Override
    public String toString() {
        String output = "";
        for(MenuItem item : menuItem) {
            output += item.toString();
        }
        return output;
    }
}
