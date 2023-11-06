package com.samucabarr.customers_crud.dto;

public class ValidationMessage {

    private String fieldName;
    private String fieldMessage;

    public ValidationMessage(String fieldName, String fieldMessage) {
        this.fieldName = fieldName;
        this.fieldMessage = fieldMessage;
    }

    public String getName() {
        return fieldName;
    }

    public String getMessage() {
        return fieldMessage;
    }
}
