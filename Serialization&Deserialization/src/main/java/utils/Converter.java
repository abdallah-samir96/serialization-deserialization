package utils;

import java.io.*;
import java.util.Optional;
import  iti.Employee;

public class Converter {

    public static boolean serializeObject(Employee emp){

        try {

            var fileOutputStream = new FileOutputStream("output.txt");
            var objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(emp);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

        return true;
    }

    public static Optional<Employee> deserializeObject() {
        var emp = new Employee();
        try {

            var fileInputStream = new FileInputStream("output.txt");
            var objectInputStream = new ObjectInputStream(fileInputStream);
            emp = (Employee)objectInputStream.readObject();


        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Optional<Employee> opt = Optional.ofNullable(emp);

        return opt;
    }
}
