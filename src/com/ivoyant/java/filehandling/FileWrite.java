package com.ivoyant.filehandling;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException {

        String filePath = "src/com/ivoyant/filehandling/names.txt";

        //Writing files using FileWriter
        //FileWriter file = new FileWriter(filePath);
        //try{
        //    file.write("My name is Superman!");
        //    System.out.println("Successfully written..!");
        //}finally {
        //    file.close();
        //}

        //Writing files using Buffered Writer
        //BufferedWriter file = new BufferedWriter(new FileWriter(filePath));
        //try{
        //    file.write("Iron man is Dr Doom");
        //    System.out.println("Successfully written..!");
        //}finally {
        //    file.close();
        //}

        //Writing using OutputStream.
        OutputStream outputStream = new FileOutputStream(filePath);
        String data = "Hello world, I am Java.";
        byte[] array = data.getBytes();
        try{
            outputStream.write(array);
            System.out.println("Written successfully...!");
        }finally {
            outputStream.close();
        }
    }
}

//we can write in files using various ways---->
//FileWriter
//BufferedWriter
//FileOutputStream
