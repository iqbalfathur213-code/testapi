package com.iqbalfathur.testapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqbalfathur.testapi.dto.ApiResponseDTO;
import com.iqbalfathur.testapi.dto.StatusResponseDTO;
import com.iqbalfathur.testapi.eenum.Status;
import com.iqbalfathur.testapi.entity.Item;
import com.iqbalfathur.testapi.service.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    
    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }
    
    @GetMapping()
    public ApiResponseDTO getItems() {
        List<Item> items = service.getAllItems();

        List<StatusResponseDTO> statusList = new ArrayList<>();
        Status[] statuses = Status.values();
        for (int i = 0; i < statuses.length; i++) {
            statusList.add(new StatusResponseDTO(i, statuses[i].name()));
        }

        return new ApiResponseDTO(items, statusList);
    }
}