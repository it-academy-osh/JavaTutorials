package com.company.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        List<Friends> friends = new ArrayList<>();
        Friends friends1 = new Friends("Kazybek");
        friends.add(friends1);
        Person person1 = new Person(1, "Murod", friends);

        System.out.println(Person.serialVersionUID);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list"));

            oos.writeObject(person1);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
