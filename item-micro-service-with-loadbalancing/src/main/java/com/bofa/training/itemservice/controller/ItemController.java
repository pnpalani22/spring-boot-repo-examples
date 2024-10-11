package com.bofa.training.itemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bofa.training.itemservice.domain.Item;
import com.bofa.training.itemservice.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService service;
    
    @GetMapping(path="/{code}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> getItem(@PathVariable("code")int itemCode){
        return new ResponseEntity<Item>(service.findItem(itemCode), HttpStatus.OK);
    }
}