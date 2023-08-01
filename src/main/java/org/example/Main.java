package org.example;


import org.example.builder.UrlBuilder;

public class Main {
    public static void main(String[] args) {
        UrlBuilder urlBuilder = new UrlBuilder();
        urlBuilder.insertUrl("localhost:3000")
                .insertUrl("api")
                .insertUrl("v1")
                .addParam("id", "5")
                .addParam("page", "10");
        System.out.println(urlBuilder.build());
    }
}