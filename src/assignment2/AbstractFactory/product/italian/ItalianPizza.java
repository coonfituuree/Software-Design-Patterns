package assignment2.AbstractFactory.product.italian;

import assignment2.AbstractFactory.product.interfaces.IPizza;

public class ItalianPizza implements IPizza {
    public void cook(){
        System.out.println("Italian Pizza");
    }
}
