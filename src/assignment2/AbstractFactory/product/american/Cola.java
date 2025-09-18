package assignment2.AbstractFactory.product.american;

import assignment2.AbstractFactory.product.interfaces.IDrink;

public class Cola implements IDrink {
    public void pour() {
        System.out.println("Cola");
    }
}
