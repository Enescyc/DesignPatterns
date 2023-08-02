package org.example.decorator;

public class AnotherLogRepositoryDecorator<T> extends MockDeleteRepository<T> {

    @Override
    public T save(T t) {
        System.out.println("Another process worked before save");
        return super.save(t);
    }
}
