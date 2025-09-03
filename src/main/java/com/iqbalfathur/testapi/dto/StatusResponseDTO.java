package com.iqbalfathur.testapi.dto;

public class StatusResponseDTO {
    
    private int id;
    private String name;

    public StatusResponseDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
