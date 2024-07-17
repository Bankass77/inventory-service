package com.programmingtechie.inventoryservice.repository;

import com.programmingtechie.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    /**
     * @param skuCode
     *         le code SKU (Stock Keeping Unit) de l'article commandé. Il s'agit d'une chaîne de caractères unique identifiant l'article dans le système
     *         d'inventaire.
     * @param quantity
     *         la quantité de l'article commandé. Il s'agit d'un entier représentant le nombre d'unités de l'article.
     */
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, int quantity);

}
