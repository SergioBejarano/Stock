package edu.eci.cvds.Stock.repository;


import edu.eci.cvds.Stock.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StockRepository {

    private HashMap<String, Product> products;

    /**
     * Get products.
     *
     * @return products
     */
    public HashMap<String, Product> getProducts() {
        return products;
    }

    
}

