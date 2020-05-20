package com.company.InputOutput;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileMain {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;

        String path = separator+"JavaTutorials" +separator+ "src" + separator + "com" +separator+ "company" +separator+ "InputOutput" +separator+ "names";

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
