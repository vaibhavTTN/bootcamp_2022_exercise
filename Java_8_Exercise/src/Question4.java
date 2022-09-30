import java.util.*;
import java.util.stream.Collectors;

/*
    Q4) WAP using java 8:

    Collect all  even numbers from a list using stream
    Given a list of objects of following class:

           class Employee{
           String fullName;
           Long salary;
           String city;
           }

          Get list of all unique firstNames of employees where their salary is less
          than 5000 and who live in delhi.
          Note: Full name is concatenation of first name,
                middle name and last name with single space in between.
 */
class Employee{
    public String firstName;
    public String middleName;
    public String lastName;
    String fullName;
    long salary;
    String city;

    public Employee(String firstName,String middleName,String lastName,long salary,String city){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.city = city;
        this.fullName = this.firstName+" "+this.middleName+" "+this.lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName);
    }

}

public class Question4 {
    public static void main(String[] args) {
//        Collect all  even numbers from a list using stream

        System.out.println("Question section 1");
        System.out.println();
        List<Integer> list = Arrays.asList(13,5,6,4,8,21,6,8,5,6,8,5,5,4,6,8,5)
                .stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println();


//        Question Section 2


        System.out.println("Question Section 2");
        System.out.println();
        Employee emp1 = new Employee("vaibhav","","kamal",6000,"Delhi");
        Employee emp2 = new Employee("Liam","","Ally",5000,"Delhi");
        Employee emp3 = new Employee("Aagaard","","Ally",5500,"Bangalore");
        Employee emp4 = new Employee("Abadi","","Alex",5600,"Delhi");
        Employee emp5 = new Employee("Abbatiello","","Nicole",3000,"Delhi");
        Employee emp6 = new Employee("Abbott","","Elizabeth",4000,"Delhi");
        Employee emp7 = new Employee("Abbott","","Bryce",2000,"Delhi");
        Employee emp8 = new Employee("Abella","","Daniela",4300,"Surat");
        Employee emp9 = new Employee("Abraham","","Jacob",2000,"Delhi");
        Employee emp10 = new Employee("Acevedo","","Nicholas",2400,"Jaipur");
        Employee emp11 = new Employee("Acevedo","","Zoe",2000,"Delhi");
        Employee emp12 = new Employee("Adam","","Marie",3000,"Delhi");
        Employee emp13 = new Employee("Adam","","June",3200,"Delhi");
        Employee emp14 = new Employee("Adams","","Ann",5600,"Indore");
        Employee emp15 = new Employee("Adams","","kamal",8000,"Delhi");
        Employee emp16 = new Employee("Acevedo","","Zfoe",2000,"Delhi");

        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(emp1);
        listEmployee.add(emp2);
        listEmployee.add(emp3);
        listEmployee.add(emp4);
        listEmployee.add(emp5);
        listEmployee.add(emp6);
        listEmployee.add(emp7);
        listEmployee.add(emp8);
        listEmployee.add(emp9);
        listEmployee.add(emp10);
        listEmployee.add(emp11);
        listEmployee.add(emp12);
        listEmployee.add(emp13);
        listEmployee.add(emp14);
        listEmployee.add(emp15);
        listEmployee.add(emp16);


        listEmployee
                .stream()
                .filter(e->(e.salary < 5000 && e.city.equals("Delhi")))
                .map(e->e.firstName)
                .distinct()
                .forEach(System.out::println);
                //.collect(Collectors.toSet());

//        for(Employee e : set){
//            System.out.println(e.firstName);
//        }

    }
}

/*
        OUTPUT

        Question section 1

        [6, 4, 8, 6, 8, 6, 8, 4, 6, 8]

        Question Section 2

        Abbatiello
        Abbott
        Abraham
        Acevedo
        Adam
        Adam
 */