package com.educaweb.course.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 297180797926669752L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
