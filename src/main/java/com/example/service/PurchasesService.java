package com.example.service;

import java.util.List;

public interface PurchasesService {
    void addProducts(List<Integer> productsIds);

    List<Integer> getProducts();
}
