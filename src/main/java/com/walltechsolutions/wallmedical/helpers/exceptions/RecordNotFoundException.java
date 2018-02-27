package com.walltechsolutions.wallmedical.helpers.exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(long recordId) {
        super("could not find a record with id: " + recordId);
    }
}
