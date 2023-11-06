package com.samucabarr.customers_crud.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class CustomValidationError extends CustomError{

    private List<ValidationMessage> validationMessages = new ArrayList<>();

    public CustomValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<ValidationMessage> getValidationMessages() {
        return validationMessages;
    }

    public void AddError(String fieldName, String fieldMessage) {
        validationMessages.add(new ValidationMessage(fieldName, fieldMessage));
    }
}
