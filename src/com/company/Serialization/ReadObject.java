package com.company.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list"));
            Person person = (Person) ois.readObject();
            System.out.println(person.getName());
            List<Friends> friends = person.getFriendsList();
            System.out.println(friends.get(0).getName());

            System.out.println(Person.serialVersionUID);

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
