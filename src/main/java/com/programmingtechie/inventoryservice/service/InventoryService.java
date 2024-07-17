package com.programmingtechie.inventoryservice.service;

import com.programmingtechie.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    /**
     * Vérifie si un article est en stock en fonction de son code SKU et de la quantité demandée.
     *
     * @param skuCode le code SKU (Stock Keeping Unit) de l'article à vérifier. Il s'agit d'une chaîne de caractères unique
     *                identifiant l'article dans le système d'inventaire.
     * @param quantity la quantité de l'article à vérifier. Il s'agit d'un entier représentant le nombre d'unités demandées.
     * @return true si l'article avec le code SKU donné existe en quantité égale ou supérieure à celle demandée,
     *         false sinon.
     */
    public boolean isInStock(String skuCode, Integer quantity) {

        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }

}
