package com.company.Serialization;

import java.io.Serializable;

public class Friends implements Serializable {
    private String name;

    public Friends(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
