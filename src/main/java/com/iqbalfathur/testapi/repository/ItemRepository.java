package com.iqbalfathur.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqbalfathur.testapi.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}