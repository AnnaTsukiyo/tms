package com.autoflex.tms.dto;

public class EmployeeDto {

    private String id;

    public EmployeeDto(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id='" + id + '\'' +
                '}';
    }
}
