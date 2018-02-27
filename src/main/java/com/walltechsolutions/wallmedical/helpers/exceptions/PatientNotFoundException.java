package com.walltechsolutions.wallmedical.helpers.exceptions;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(long patientId) {
        super("could not find a patient with id: " + patientId);
    }
}
