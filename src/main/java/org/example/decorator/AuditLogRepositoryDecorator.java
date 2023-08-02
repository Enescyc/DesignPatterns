package org.example.decorator;

public class RepositoryDecorator<T> extends MockDeleteRepository<T> {
    @Override
    public boolean delete() {
        System.out.println("Audit logs saved before logging");
        return super.delete();
    }
    @Override
    public T save(T t){
        System.out.println("Audit logs saved before logging");
        return super.save(t);
    }
}
