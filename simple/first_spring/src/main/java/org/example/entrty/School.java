package org.example.entrty;

public class School {
    private String name;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    private String address;

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
