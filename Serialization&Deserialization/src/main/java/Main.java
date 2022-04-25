import java.io.*;
import java.util.List;
import java.util.Optional;

import iti.Employee;
import utils.Converter;

public class Main {


      public static void main(String[] args) throws CloneNotSupportedException {

         List<String> interests = List.of("Football","Swimming","Reading","Volunteer");
         Employee emp = new Employee("Abdallah Samir",25,4000,interests);

          if(Converter.serializeObject(emp)){
              System.out.println("The Object has been serialized");
          }


          Optional<Employee> opt = Converter.deserializeObject();
          if(opt.isPresent()){
              Employee emp2 = opt.get();
              System.out.println("***********************");
              System.out.println("Employee Name   : " + emp2.getName());
              System.out.println("Employee Age    : " + emp2.getAge());
              System.out.println("Employee Salary : " + emp2.getSalary());
              emp2.printInterests();
              System.out.println("***********************");
          }else{
              System.out.println("Can't Deserialize the Object");
          }




      }
}
