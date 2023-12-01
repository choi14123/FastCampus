package org.example.Customer;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        Cook cook = new Cook(menuItem);
        return cook;
    }
}
