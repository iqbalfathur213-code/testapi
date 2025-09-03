package com.iqbalfathur.testapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iqbalfathur.testapi.entity.Item;
import com.iqbalfathur.testapi.repository.ItemRepository;

@Service
public class ItemService {
    
    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> getAllItems() {
        return repository.findAll();
    }

}
