package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.ProductInvoice;
import com.crt.lisp.repository.ProductInvoiceRepository;

@Transactional
@Service
public class ProductInvoiceService {

@Autowired    private ProductInvoiceRepository productInvoiceRepository;

    public void insert(ProductInvoice productInvoice) {
        productInvoiceRepository.save(productInvoice);
    }


    public Optional<ProductInvoice> findById(int id) {
        return productInvoiceRepository.findById(id);
    }

    public Iterable<ProductInvoice> findAll() {
        return productInvoiceRepository.findAll();
    }

    public void updateProductInvoice(ProductInvoice productInvoice) {
        productInvoiceRepository.save(productInvoice);
    }

    public void deleteProductInvoice(ProductInvoice productInvoice) {
        productInvoiceRepository.delete(productInvoice);
    }



}
