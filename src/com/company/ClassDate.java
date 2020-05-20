package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ClassDate {
    public static void main(String[] args) throws InterruptedException, IOException {

        //Класс Date, Calendar, (ArrayList - > LinkedList) -> List
        //java.sql.Date
        //java.util.Date

        //хранит дату в миллисекундах
        //1 января 1970 года
        //0-11

        //Описание                  //операция          //ArrayList         //LinkedList
        //Взятие элемента           //get()             //быстро            //медленно
        //Присвоение элемента       //set()             //быстро            //медленно
        //Добавление Элемента       //add()             //быстро            //быстро
        //Вставка элемента          //add(i, value)     //медленно          //быстро
        //Удаление элемента         //remove            //медленно          //быстро

        //[515,151,515,15,15,15,52,5,2,26,226,2,55]
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        System.out.println("ArrayList Get: " + getInsertTimeInMsGet(arrayList));
        System.out.println("ArrayList Set: " + getInsertTimeInMsSet(arrayList));
        System.out.println("ArrayList Remove: " + getInsertTimeInMsRemove(arrayList));

        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        System.out.println("LinkedList Get: " + getInsertTimeInMsGet(linkedList));
        System.out.println("LinkedList Set: " + getInsertTimeInMsSet(linkedList));
        System.out.println("LinkedList Remove: " + getInsertTimeInMsRemove(linkedList));

    }

    public static long getInsertTimeInMsRemove(List list){
        Date date1 = new Date();
        remove10000(list);
        Date date2 = new Date();
        long time = date2.getTime() - date1.getTime();
        return time;
    }

    public static long getInsertTimeInMsGet(List list){
        Date date1 = new Date();
        get10000(list);
        Date date2 = new Date();
        long time = date2.getTime() - date1.getTime();
        return time;
    }

    public static long getInsertTimeInMsSet(List list){
        Date date1 = new Date();
        set10000(list);
        Date date2 = new Date();
        long time = date2.getTime() - date1.getTime();
        return time;
    }

    public static void insert10000(List list){
        for (int i = 0; i < 10000; i++){
            list.add(i);
        }
    }

    public static void get10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.set(i, 555);
        }
    }

    public static void remove10000(List list){
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}
