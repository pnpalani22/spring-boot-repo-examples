package com.bofa.training.itemservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bofa.training.itemservice.domain.Item;

@Service
public class ItemService {
    private Map<Integer, Item> list=new HashMap<>();

    public ItemService() {
        super();
        // TODO Auto-generated constructor stub
        list.put(1001, new Item(1001, "Apple", 200));
        list.put(1002, new Item(1002, "Orange", 100));
        list.put(1003, new Item(1003, "Mango", 400));
    }

    public Item findItem(int code) {
        return list.get(code);
    }
    
}