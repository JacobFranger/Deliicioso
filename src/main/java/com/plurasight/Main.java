package com.plurasight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);






        System.out.print("Please order here: ");
        String info = scanner.nextLine().trim();
        Scanner scanner1 = new Scanner(System.in);



        System.out.print("Please add a Drink: ");
        String info1 = scanner.nextLine();
        System.out.print("Please add Chips: ");
        String info2 = scanner.nextLine();








        try {

            FileWriter fileWriter = new FileWriter("src/main/resources/text.txt", true);

            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            String text;
            LocalDateTime now1 = LocalDateTime.now();
            DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyyMMddHHmm");

            bufWriter.close();
        }
        catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");
            e.getStackTrace();
        }
    }




}
