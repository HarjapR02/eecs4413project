package com.auction.service;

import com.auction.model.Item;
import com.auction.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> searchItems(String keyword) {
        return itemRepository.findByKeywordContainingIgnoreCase(keyword);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
