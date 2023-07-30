package com.example.service;

import com.example.data.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchasesServiceImpl implements PurchasesService{

    private final Basket basket;

    public PurchasesServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addProducts(List<Integer> productsIds) {
        basket.addProducts(productsIds);
    }

    @Override
    public List<Integer> getProducts() {
        return basket.getProducts();
    }
}
