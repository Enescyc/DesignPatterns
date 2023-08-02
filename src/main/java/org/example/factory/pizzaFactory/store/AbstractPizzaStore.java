package org.example.factory.pizzaFactory.store;

import org.example.factory.pizzaFactory.IPizza;

public abstract class AbstractPizzaStore {
    protected abstract IPizza createPizza(String type) throws IllegalArgumentException;
    public IPizza orderPizza(String type){
      IPizza pizza = createPizza(type);
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      return pizza;
    }
}
