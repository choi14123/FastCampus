package org.example.Customer;

import java.util.Objects;

public class MenuItem {
    private final int price;

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return price == menuItem.price && Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    public int getPrice() {
        return price;
    }

    public boolean matches(String name) {
        return this.name.equals(name);
    }

    private final String name;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }


}
