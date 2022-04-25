package iti;
import java.io.Serializable;
import java.util.List;
public class Employee implements Serializable {

    private String name;
    private int age;
    private long salary;
    private List<String> interests;


    public Employee(){

    }
    public Employee(String name, int age, long salary, List<String> interests) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public void printInterests(){

        interests.stream().forEach((var interest) -> {
            System.out.print(interest+", ");
        });
        //for new line after writing the interests to console
        System.out.println();
    }
}
