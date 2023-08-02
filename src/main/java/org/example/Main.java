package org.example;


import org.example.adapter.*;
import org.example.builder.UrlBuilder;
import org.example.decorator.AnotherLogRepositoryDecorator;
import org.example.decorator.AuditLogRepositoryDecorator;
import org.example.decorator.MockDeleteRepository;
import org.example.factory.pizzaFactory.store.AnkaraPizzaStore;
import org.example.factory.pizzaFactory.IPizza;
import org.example.factory.pizzaFactory.store.IstanbulPizzaStore;


class Customer {

    public Customer(String name, int age) {
        this.age = age;
        this.name = name;
    }

    private String name;
    private int age;
}

public class Main {
    public static void main(String[] args) {


        // BUILDER
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.insertUrl("localhost:3000")
                .insertUrl("api")
                .insertUrl("v1")
                .addParam("id", "5")
                .addParam("page", "10");
        System.out.println(urlBuilder.build());


        // FACTORY
        AnkaraPizzaStore ankaraPizzaStore = new AnkaraPizzaStore();
        IstanbulPizzaStore istanbulPizzaStore = new IstanbulPizzaStore();
        IPizza cheesePizza = ankaraPizzaStore.orderPizza("cheese");
        IPizza veganPizza = ankaraPizzaStore.orderPizza("vegan");
        IPizza mixed = istanbulPizzaStore.orderPizza("mixed");


        // DECORATOR
        AuditLogRepositoryDecorator<Customer> auditLogRepository = new AuditLogRepositoryDecorator<>();
        AnotherLogRepositoryDecorator<Customer> anotherLogRepositoryDecorator = new AnotherLogRepositoryDecorator<>();
        Customer customer = new Customer("Enes", 24);
        auditLogRepository.save(customer);
        anotherLogRepositoryDecorator.save(customer);

        Transaction transaction = new Transaction();
        transaction.setAmount(10);
        transaction.setFromIban("1");
        transaction.setToIban("2");

        // ADAPTER
        JsonBankApi jsonBankApi = new JsonBankApi();
        JsonBankApiAdapter jsonBankApiAdapter = new JsonBankApiAdapter(jsonBankApi);
        XmlBankApi xmlBankApi = new XmlBankApi();
        XmlBankApiAdapter xmlBankApiAdapter = new XmlBankApiAdapter((xmlBankApi));

        jsonBankApiAdapter.executeTransaction(transaction);
        xmlBankApiAdapter.executeTransaction(transaction);

    }
}