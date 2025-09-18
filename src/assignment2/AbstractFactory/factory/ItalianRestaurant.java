package assignment2.AbstractFactory.factory;

import assignment2.AbstractFactory.product.interfaces.IDessert;
import assignment2.AbstractFactory.product.interfaces.IDrink;
import assignment2.AbstractFactory.product.interfaces.IPizza;
import assignment2.AbstractFactory.product.italian.ItalianPizza;
import assignment2.AbstractFactory.product.italian.ItalianWine;
import assignment2.AbstractFactory.product.italian.Tiramisu;

public class ItalianRestaurant implements IRestaurant {
    public IPizza createPizza(){
        return new ItalianPizza();
    }

    public IDrink createDrink() {
        return new ItalianWine();
    }

    public IDessert createDessert(){
        return new Tiramisu();
    }
}
