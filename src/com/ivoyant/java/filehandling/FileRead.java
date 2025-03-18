package com.ivoyant.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        String filePath = "src/com/ivoyant/filehandling/names.txt";

        System.out.println("Reading by FileReader");
        try (FileReader file = new FileReader(filePath)) {
            int i;
            while ((i = file.read()) > 0) {
                System.out.print((char) i);
            }
        }
        System.out.println();

        System.out.println("Reading by BufferedReader");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String data = "";
        while((data = br.readLine()) != null){
            System.out.println(data);
        }
    }
}

