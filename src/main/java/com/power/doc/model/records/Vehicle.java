package com.power.doc.model.records;

public sealed interface Vehicle permits Car, Truck {

    String getRegistrationNumber();

}
