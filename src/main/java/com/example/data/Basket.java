package com.example.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Integer> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public List<Integer> getProducts() {
        return products;
    }

    public void addProducts(List<Integer> productsIds) {
        products.addAll(productsIds);
    }
}
