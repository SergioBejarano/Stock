
package edu.eci.cvds.Stock.service;

import edu.eci.cvds.Stock.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.eci.cvds.Stock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class StockService   {

    private StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    @RequestMapping("/stock")
    public HashMap<String, Product>  getProducts()    {
        return stockRepository.getProducts();
    }


}