package com.bofa.training.itemorderservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bofa.training.itemorderservice.domain.Item;

@Component
@FeignClient("ITEM-MICRO-SERVICE")
public interface ItemProxy {
    @GetMapping("/item/{code}")
    public Item getItemDetails(@PathVariable("code") int itemCode);

}