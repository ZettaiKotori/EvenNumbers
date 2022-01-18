package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException  {
        int count = 0;
        try (Scanner sc = new Scanner(new File("src/mass.txt"))) {
            while (sc.hasNextInt()) {
                if (sc.nextInt() % 2 == 0) count++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Количество четных чисел: " + count);
    }
}
