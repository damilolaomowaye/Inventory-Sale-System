package com.crt.lisp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crt.lisp.entity.Stock;
import com.crt.lisp.entity.TheLogConverter;
import com.crt.lisp.service.StockLogService;
import com.crt.lisp.service.StockService;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockService stockService;
    @Autowired
    private StockLogService stockLogService;

    @RequestMapping("")
    public Iterable<Stock> getAllStock() {
        return stockService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Stock> searchStock(@PathVariable int id) {
        return stockService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addStock(@RequestBody Stock stock) {
        stockService.insert(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateStock(@RequestBody Stock stock) {
        stockService.updateStock(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteStock(@RequestBody Stock stock) {
        stockService.deleteStock(stock);
        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

}
