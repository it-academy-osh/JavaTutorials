package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DateExample {
    public static void main(String[] args) {
        TheFirstNameDuplicates_task5(createMap_task5());
    }

    static  Map<String , String> createMap_task5(){
        Map<String , String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Васильев", "Василий");
        map.put("Козлов", "Борис"); //удаление
        map.put("Шаурмян", "Шаурма");
        map.put("Борисов", "Борис");  //удаление
        map.put("Идрисов", "Идрис");
        map.put("Хачяпурян", "Балтабай");
        map.put("Перельмян", "Пельмень");
        map.put("Балтабаев", "Балтабай");  //удаление
        map.put("Тешабаев", "Балтабай");  //удаление
        return map;
    }

    static void TheFirstNameDuplicates_task5 (Map<String , String> map){
        Map<String, String> copy = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        int counter = 0;
        for (Map.Entry <String, String> pair: map.entrySet()) {
            String value = pair.getValue();
            if(counter > 0 && copy.containsValue(value)){
                map1.putAll(removeItemFromMapByValue_task5(map1, value));
                counter++;
            }
            else if (copy.containsValue(value) && counter == 0){
                map1.putAll(removeItemFromMapByValue_task5(createMap_task5(), value));
                counter++;
            }
            else {
                copy.put(pair.getKey(), value);
            }
        }
        for (Map.Entry <String, String > print: map1.entrySet()) {
            System.out.println(print);
        }
    }

    static Map<String , String> removeItemFromMapByValue_task5(Map<String , String> map, String value){
        Map<String, String > copy = new HashMap<>(map);
        for (Map.Entry <String, String> pair: copy.entrySet()) {
            if (pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
        return map;
    }
}
