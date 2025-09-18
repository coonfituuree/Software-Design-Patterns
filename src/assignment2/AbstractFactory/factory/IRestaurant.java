package assignment2.AbstractFactory.factory;

import assignment2.AbstractFactory.product.interfaces.IDessert;
import assignment2.AbstractFactory.product.interfaces.IDrink;
import assignment2.AbstractFactory.product.interfaces.IPizza;

public interface IRestaurant {
    IPizza createPizza();
    IDrink createDrink();
    IDessert createDessert();
}
