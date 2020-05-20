package com.company;

public class ArrayMulti {
    public static void main(String[] args) {

        Text text1 = new Text("Murod");
        text1.setName("Timur");

        Text text2 = new Text("Timur");
        text2.print(text1);

    }
}

class Text{

    private String name;

    public Text(String name){
        this.name = name;
    }

    String getMessage(String text){
        return "Hello " + text;
    }

    void print(Text text){
        System.out.println(getMessage(text.getName()) + " Timur");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

