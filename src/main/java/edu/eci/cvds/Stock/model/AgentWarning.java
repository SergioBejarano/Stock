package edu.eci.cvds.Stock.model;


import java.util.HashMap;

public class AgentWarning implements Agent {


    /**
     * Alert if the amount of product is less than 5
     *
     * @param name
     * @param quantity
     */
    public void alert (String name, int quantity) {
        if (quantity < 5) {
            System.out.println("ALERTA!!! El stock del Producto: " + name + " es muy bajo, solo quedan"
                    + String.valueOf(quantity) + " unidades.");
        }

    }
}