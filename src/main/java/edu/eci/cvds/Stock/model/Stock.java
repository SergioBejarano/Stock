package edu.eci.cvds.Stock.model;


import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

public class Stock {

    private HashMap<String, Product> products;
    @Autowired
    private AgentWarning agentWarning;
    @Autowired
    private AgentLog agentLog;

    /**
     * Create a stock without products for client.
     */
    public Stock() {
        this.products = new HashMap<String, Product>();
        agentWarning = new AgentWarning();
        agentLog = new AgentLog();
    }

    /**
     * Add a new product to stock.
     *
     * @param name
     * @param price
     * @param quantity
     * @param category
     */
    public boolean addProduct(String name, int price, int quantity, String category) {

        boolean res = false;
        if (!name.isEmpty()) {
            Product product = new Product(name, price, quantity, category);
            products.put(name, product);
            alert(name, quantity);
            res = true;
        }
        return res;
    }

    /**
     * Update the quantity for this specific product.
     *
     * @param name
     * @param quantity
     */
    public boolean updateProduct(String name, int quantity) {
        boolean ans = false;
        for (HashMap.Entry<String, Product> entry : products.entrySet()) {
            if (entry.getKey().equals(name)) {
                entry.getValue().update(quantity);
                alert(name, quantity);
                ans = true;
            }
        }
        return ans;
    }

    /**
     * Notify to agents.
     *
     * @param name
     * @param quantity
     */
    private void alert(String name, int quantity) {
        agentWarning.alert(name, quantity);
        agentLog.alert(name, quantity);
    }
}