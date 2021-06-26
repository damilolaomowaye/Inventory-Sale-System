package com.crt.lisp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crt.lisp.entity.Pricing;
import com.crt.lisp.repository.PricingRepository;

/**
 * @Author Oluwadamilola on 24-06-2021.
 */

@Transactional
@Service
public class PricingService {

    @Autowired
    private PricingRepository pricingRepository;


    @RequestMapping("")
    public Iterable<Pricing> getAllStock() {
        return pricingRepository.findAll();
    }

    public void insert(Pricing pricing) {
        pricingRepository.save(pricing);
    }


    public Iterable<Pricing> findAll() {
        return pricingRepository.findAll();
    }

    public Optional<Pricing> find(int id) {
        return pricingRepository.findById(id);
    }

    public void updatePricing(Pricing pricing) {
        pricingRepository.save(pricing);
    }

    public void deletePricing(Pricing pricing) {
        pricingRepository.delete(pricing);
    }


}
