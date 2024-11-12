package com.plurasight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            FileWriter fileWriter = new FileWriter("src/main/resources/text.txt", true);

            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            String text;
            for(int i = 22; i <= 30; i++) {
                text = String.format("Counting %d\n", i);
                bufWriter.write(text);
            }

            bufWriter.close();
        }
        catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");
            e.getStackTrace();
        }
    }



}
