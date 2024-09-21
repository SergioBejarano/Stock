package edu.eci.cvds.Stock.tdd;

import edu.eci.cvds.Stock.model.Stock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StockTest {

    private Stock stock;

    /**
     * Default constructor for test class StockTest
     */
    public StockTest() {

    }

    @BeforeEach
    public void setUp() {
        this.stock = new Stock();
        stock.addProduct("arroz", 10000, 3, "alimento");
        stock.addProduct("celular", 1000000, 5, "tecnología");
        stock.addProduct("camisa", 250000, 3, "ropa");
    }

    @Test
    public void shouldAddProducts() {
        boolean ans1 = stock.addProduct("cereal", 10000, 3, "alimento");
        boolean ans2 = stock.addProduct("audifonos", 1000000, 5, "tecnología");
        boolean ans3 = stock.addProduct("pantalón", 250000, 3, "ropa");
        assertTrue(ans1);
        assertTrue(ans2);
        assertTrue(ans3);
    }

    @Test
    public void shouldNotAddProductWithoutName() {
        boolean ans = stock.addProduct("", 10000, 3, "alimento");
        assertFalse(ans);

    }


    @Test
    public void shouldUpdateProducts() {
        boolean ans1 = stock.updateProduct("arroz", 12);
        boolean ans2 = stock.updateProduct("celular", 10);
        boolean ans3 = stock.updateProduct("camisa", 4);
        assertTrue(ans1);
        assertTrue(ans2);
        assertTrue(ans3);
    }

    @Test
    public void shouldNotUpdateProductsIfNotExists() {
        boolean ans1 = stock.updateProduct("camiseta", 2);
        boolean ans2 = stock.updateProduct("computador", 10);
        assertFalse(ans1);
        assertFalse(ans1);
    }

}
