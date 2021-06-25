package com.crt.lisp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crt.lisp.entity.Pricing;
import com.crt.lisp.entity.TheLogConverter;
import com.crt.lisp.service.PricingLogService;
import com.crt.lisp.service.PricingService;

/**
 * @Author Oluwadamilola on 24-06-2021.
 */

/**
 * Because of the Business entity confliction I have to consider that pricing
 * happens on each product wise and not generalized for entities.
 */

@RestController
@RequestMapping("/categories/{id}/products/{id}/pricings")
public class PricingController {


    @Autowired
    public PricingService pricingService;
    @Autowired
    private PricingLogService pricingLogService;

    @RequestMapping("")
    public Iterable<Pricing> getAllPricing() {
        return pricingService.findAll();
    }


    @RequestMapping("/{id}")
    public Optional<Pricing> searchPricing(@PathVariable int id) {
        return pricingService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addPricing(@RequestBody Pricing pricing) {
        pricingService.insert(pricing);
        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Pricing pricing) {
        pricingService.updatePricing(pricing);
        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deletePricing(@RequestBody Pricing pricing) {
        pricingService.deletePricing(pricing);
        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }


}

