package com.aeki.AEKI.exception;

public class NotFoundException extends Throwable {

    public class CartNotFoundException extends RuntimeException {
        private final String id;

        public CartNotFoundException(String id) {
            this.id;
        }

        @Override
        public String getMessage() {
            return String.format("Cart with id %s not foud", id);
        }
    }
}
