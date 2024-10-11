package com.bofa.training.itemorderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.training.itemorderservice.domain.Item;
import com.bofa.training.itemorderservice.domain.ItemOrder;
import com.bofa.training.itemorderservice.proxy.ItemProxy;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItemOrderService {

    @Autowired
    private ItemProxy proxy;
    
    public ItemOrder getOrderDetails(int code,int quantity) {
    	log.info("from itemorderservice sending request to itemservice");
        Item item=proxy.getItemDetails(code);
        log.info("itemorderservice got response from itemservice");
        ItemOrder order=new ItemOrder(code, item.getItemName(), item.getPrice()*quantity);
        return order;
    }
}
