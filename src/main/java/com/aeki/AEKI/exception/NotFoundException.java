package com.aeki.AEKI.exception;

public class NotFoundException extends RuntimeException {

    private final String id;

    public NotFoundException(String id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return String.format("Object with id %s not found", id);
    }

}
