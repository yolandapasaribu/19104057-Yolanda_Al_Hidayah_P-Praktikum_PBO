package com.yolanda.modul5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) {
        File file = new File("D:\\Tugas\\Praktikum\\Praktikum PBO\\yoloo.txt");

        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Read File Berhasil!");
        } catch (FileNotFoundException e){
            System.out.println("Gaada filenya!");
        }
    }
}
