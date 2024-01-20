package com.nancheung.enumtest;

public enum A {
    X, Y, Z;

    private String name;

    A() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
