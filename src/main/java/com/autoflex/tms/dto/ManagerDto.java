package com.autoflex.tms.dto;

public class ManagerDto {
    private String id;

    public ManagerDto(String id) {
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
        return "ManagerDto{" +
                "Id='" + id + '\'' +
                '}';
    }
}
