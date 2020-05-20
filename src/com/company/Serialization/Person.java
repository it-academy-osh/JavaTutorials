package com.company.Serialization;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    public static final long serialVersionUID = 4968387655237880762L;
    private int id;
    private String name;
    private List<Friends> friendsList;

    public Person(int id, String name, List<Friends> friendsList) {
        this.id = id;
        this.name = name;
        this.friendsList = friendsList;
    }

    public List<Friends> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<Friends> friendsList) {
        this.friendsList = friendsList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}
