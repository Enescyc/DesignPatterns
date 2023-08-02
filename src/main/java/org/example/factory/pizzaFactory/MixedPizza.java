package org.example.factory.pizzaFactory;

public class MixedPizza implements IPizza{
    @Override
    public void prepare() {
        System.out.println("prepare mixed pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake mixed pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut mixed pizza");
    }
}
