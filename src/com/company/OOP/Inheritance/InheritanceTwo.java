package com.company.OOP.Inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InheritanceTwo{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        char[] array = a.toCharArray();

        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) {
                list.add(array[i]);
            } else if (array[i] == ' ') {
                continue;
            } else {
                list1.add(array[i]);
            }
        }
        System.out.println(list);
        System.out.println(list1);
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}

