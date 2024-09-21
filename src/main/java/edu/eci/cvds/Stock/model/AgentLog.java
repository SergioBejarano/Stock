package edu.eci.cvds.Stock.model;


import java.util.HashMap;

public class AgentLog implements Agent {

    /**
     * Alert if the stock of a product changes.
     *
     * @param name
     * @param quantity
     */
    public void alert(String name, int quantity)  {
        System.out.println("Producto: " + name + " -> " + String.valueOf(quantity) +
                "unidades disponibles");
    };


}