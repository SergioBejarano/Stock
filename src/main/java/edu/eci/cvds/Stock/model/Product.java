package edu.eci.cvds.Stock.model;


public class Product {

    private String name;
    private int price;
    private int quantity;
    private String category;

    /**
     * Create a product.
     *
     * @param name
     * @param price
     * @param quantity
     * @param category
     */
    public Product(String name, int price, int quantity, String category)   {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    /**
     * Update quantity for this product.
     *
     * @param quantity
     */
    public void update(int quantity)    {
        this.quantity = quantity;
    }


}