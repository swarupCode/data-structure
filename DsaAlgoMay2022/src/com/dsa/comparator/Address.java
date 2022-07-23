package com.dsa.comparator;

public class Address {
    private String area;
    private int pincode;

    public Address(String area, int pincode) {
        this.area = area;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
