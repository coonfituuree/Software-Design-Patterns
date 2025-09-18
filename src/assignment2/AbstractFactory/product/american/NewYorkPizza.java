package assignment2.AbstractFactory.product.american;

import assignment2.AbstractFactory.product.interfaces.IPizza;

public class NewYorkPizza implements IPizza {
    public void cook(){
        System.out.println("Making a New York Pizza");
    }
}
