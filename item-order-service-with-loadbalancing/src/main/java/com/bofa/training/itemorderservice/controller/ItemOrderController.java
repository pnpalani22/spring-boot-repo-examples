package com.bofa.training.itemorderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.training.itemorderservice.domain.ItemOrder;
import com.bofa.training.itemorderservice.service.ItemOrderService;

@RestController
@RequestMapping("/itemorder")
public class ItemOrderController {
    @Autowired
    private ItemOrderService service;
    
    @GetMapping(path="/{code}/{quantity}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ItemOrder getOrderDetails(@PathVariable("code")int code,@PathVariable("quantity") int quantity)
    {
        return service.getOrderDetails(code, quantity);
    }
}
