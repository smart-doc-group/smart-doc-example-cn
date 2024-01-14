package com.power.doc.model.records;

public record Truck(int loadCapacity, String registrationNumber,int permits) implements Vehicle {

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

}