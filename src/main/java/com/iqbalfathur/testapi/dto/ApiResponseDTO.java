package com.iqbalfathur.testapi.dto;

import java.util.List;

import com.iqbalfathur.testapi.entity.Item;

public class ApiResponseDTO {
    private List<Item> data;
    private List<StatusResponseDTO> status;

    public ApiResponseDTO(List<Item> data, List<StatusResponseDTO> status) {
        this.data = data;
        this.status = status;
    }

    public List<Item> getData() {
        return data;
    }

    public List<StatusResponseDTO> getStatus() {
        return status;
    }
}
