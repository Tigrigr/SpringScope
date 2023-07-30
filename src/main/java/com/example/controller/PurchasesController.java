package com.example.controller;

import com.example.service.PurchasesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchasesController {

    private final PurchasesService purchasesService;

    public PurchasesController(PurchasesService purchasesService) {
        this.purchasesService = purchasesService;
    }

    @GetMapping("order/add")
    public void addProducts(@RequestParam List<Integer> productsIds) {
        purchasesService.addProducts(productsIds);
    }
    @GetMapping("order/get")
    public List<Integer> getProducts() {
        return purchasesService.getProducts();
    }
}
