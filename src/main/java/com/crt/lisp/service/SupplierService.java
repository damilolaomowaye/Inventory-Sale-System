package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crt.lisp.entity.Supplier;
import com.crt.lisp.repository.SupplierRepository;

@Transactional
@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public void insert(Supplier supplier) {
        supplierRepository.save(supplier);
    }


    public Optional<Supplier> findById(int id) {
        return supplierRepository.findById(id);
    }

    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public void updateSupplier(Supplier supplier) {

        supplierRepository.save(supplier);
    }

    public void deleteSupplier(Supplier supplier) {

        supplierRepository.delete(supplier);
    }
}
