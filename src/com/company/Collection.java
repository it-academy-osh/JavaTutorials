package com.company;

import java.util.*;

public class Collection {

    //Коллекции (Set, List, Map) Iterator

    //Коллекция/контейнерами - хранить набор других элементов
    //ArrayList
    //Set - множество
    //List - список
    //Map - словарь (или карта)
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        //1 способ
        int counter = 0;
        for (String s: set){
            System.out.println(s);
            counter++;
            if (s.equals("женьшень")){
                System.out.println(counter);
            }
        }

        //2 способ
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }

        System.out.println(set.size());


    }
}
