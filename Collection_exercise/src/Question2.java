//2) Given the following class
//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.
//
//Also, Write a program to sort Employee objects based on salary using Comparator.

import java.util.*;

class Employee {
    String Name;
    Double Age;
    Double salary;

    public Employee(String Name,Double Age,Double salary){
        this.Name = Name;
        this.Age = Age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return Name;
    }
}
public class Question2 {
    public static void iterateList(List<Employee> list){
        for(Employee item:list){
            System.out.print(item.Name +"       ");
            System.out.print(item.Age+"         ");
            System.out.print(item.salary+"      ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee("vaibhav", 21.0, 25000.0);
        Employee emp2 = new Employee("sita",21.0,30000.0);
        Employee emp3 = new Employee("ramtari",21.0,28000.100);
        Employee emp4 = new Employee("naveen",21.0,26000.500);
        Employee emp5 = new Employee("kartikey",21.0,55000.0);
        Employee emp6 = new Employee("vedika",21.0,26000.500);
        Employee emp7 = new Employee("kamal",21.0,21000.930);
        Employee emp8 = new Employee("mohit",21.0,24000.0);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        list.add(emp8);

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return employee.Name.compareTo(t1.Name);
            }
        });
        System.out.println("Sort using Name : \n");
        iterateList(list);
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return employee.salary.compareTo(t1.salary);
            }
        });

        System.out.println();
        System.out.println("Sort using salary : \n");
        iterateList(list);

    }
}
