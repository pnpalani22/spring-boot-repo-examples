package com.bofa.training.itemorderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bofa.training.itemorderservice.domain.Item;
import com.bofa.training.itemorderservice.domain.ItemOrder;
import com.bofa.training.itemorderservice.proxy.ItemProxy;

@Service
public class ItemOrderService {

    @Autowired
    private ItemProxy proxy;
    
    public ItemOrder getOrderDetails(int code,int quantity) {
        Item item=proxy.getItemDetails(code);
        ItemOrder order=new ItemOrder(code, item.getItemName(), item.getPrice()*quantity);
        return order;
    }
}
