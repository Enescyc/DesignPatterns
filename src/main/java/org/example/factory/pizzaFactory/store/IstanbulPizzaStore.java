package org.example.factory;

public class IstanbulPizzaStore extends AbstractPizzaStore {
    @Override
    protected IPizza createPizza(String type) throws IllegalArgumentException {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "mixed":
                return new MixedPizza();
        }
        throw new IllegalArgumentException("Invalid pizza type for Istanbul Pizza Store");
    }
}
