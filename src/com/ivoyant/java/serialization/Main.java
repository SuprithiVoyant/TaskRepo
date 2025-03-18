package com.ivoyant.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cars car = new Cars("Audi","Black",35000.23d);
        Cars car1 = new Cars("AudiQ8","Black",34564.23d);
        Cars car2 = new Cars("AudiAq","Red",45666.76d);

        car.addCars(car1);
        car.addCars(car2);

        System.out.println("Original car : "+car);

        String filePath = "src/com/ivoyant/serialization/cars.ser";

        //serialization steps--->
        //Implement serialization interface
        //Create FileOutputStream with the file name.
        //Create ObjectOutputStream
        //write Object
        //close the stream.

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(car);
        fileOutputStream.close();
        objectOutputStream.close();

        //Deserialization steps--->
        //Declare objects without initialization
        //create FileInputStream.
        //create ObjectInputStream.
        //Read Objects.
        //close the stream.

        Cars deserializedCars;

        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        deserializedCars = (Cars)objectInputStream.readObject();
        System.out.println("Deserialized : "+deserializedCars);
        fileInputStream.close();
        objectInputStream.close();

    }
}

//We serialize Non-static fields.
//static and transient fields won't be affected.
//The properties must be private.
