//Q5) Create a class named Employee with fields firstname,lastname,age and designation.
//        The class should:
//
//      i.   have all types of constructors to initialize the object
//      ii.  class should also have setter methods to update a particular field
//      iii. Override its toString method to display a meaningful message using all these fields.

class Employee{
    private String firstname;
    private String lastname;
    private int age;
    private String designation;

    public Employee(){
        this("first_name","last_name",0,"designation");
    }

    public Employee(String firstname,String lastname,int age,String designation){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.designation = designation;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }


    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getAge() {
        return this.age;
    }

    public String getDesignation() {
        return this.designation;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstname);
        sb.append(" ");
        sb.append(this.lastname);
        return sb.toString();
    }
}

public class Question5 {
    public static void main(String[] args){
        Employee emp = new Employee();
        Employee emp1 = new Employee("mohit","ramtari",22,"software engineer");

//        updating value using setter methods
        emp.setFirstname("vaibhav");
        emp.setLastname("Kamal");
        emp.setAge(21);
        emp.setDesignation("Software Engineer");



        System.out.println(emp.getFirstname());
        System.out.println(emp.getLastname());
        System.out.println(emp.getAge());
        System.out.println(emp.getDesignation());

        System.out.println(emp1.getFirstname());
        System.out.println(emp1.getLastname());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getDesignation());


//  overridding toString
    System.out.println("overridding the toString : "+emp);

    }
}
