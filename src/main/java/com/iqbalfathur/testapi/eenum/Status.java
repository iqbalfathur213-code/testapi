package com.iqbalfathur.testapi.eenum;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    SUCCESS(0),
    FAILED(1);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    @JsonValue
    public int getCode() {
        return code;
    }
}
