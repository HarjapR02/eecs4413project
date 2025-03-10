package com.auction.controller;

import com.auction.model.Item;
import com.auction.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/search")
    public List<Item> searchItems(@RequestParam String keyword) {
        return itemService.searchItems(keyword);
    }

    @GetMapping("/all")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
