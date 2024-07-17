package com.programmingtechie.inventoryservice.controller;

import com.programmingtechie.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
@RefreshScope
public class InventoryController {

    private final InventoryService inventoryService;

    /**
     * @param skuCode
     *         le code SKU (Stock Keeping Unit) de l'article commandé. Il s'agit d'une chaîne de caractères unique identifiant l'article dans le système
     *         d'inventaire.
     * @param quantity
     *         la quantité de l'article commandé. Il s'agit d'un entier représentant le nombre d'unités de l'article.
     * @return true or false when skuCode and Quantity are in stock
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
        return inventoryService.isInStock(skuCode, quantity);
    }

}
