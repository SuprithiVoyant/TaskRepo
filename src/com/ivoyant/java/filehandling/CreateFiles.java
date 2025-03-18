package com.ivoyant.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFiles {
    public static void main(String[] args) throws IOException {

        //path for file creation.
        String filePath = "src/com/ivoyant/filehandling/names.txt";

        //creating new file
        File file = new File(filePath);
        System.out.println((file.createNewFile())?"File created successfully..!":"File's already created..!");

        //file handling methods.
        if(file.exists()){
            System.out.println("File Name : "+file.getName());
            System.out.println("File path : "+file.getAbsolutePath());
            System.out.println("File writeable : "+file.canRead());
            System.out.println("File readable : "+file.canWrite());
            System.out.println("File size : "+file.length());
            //System.out.println("File Deleted :"+file.delete());
        }else{
            System.out.println("File do not exist");
        }
    }
}
