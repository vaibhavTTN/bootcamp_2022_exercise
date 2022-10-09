//Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Question1 {
    static String firstName = "Vaibhav";
    static String lastName = "Kamal";
    static int age = 21;

    static {
        System.out.println();
        System.out.println("Static Block : ");
        System.out.println("FirstName : "+ firstName);
        System.out.println("LastName : "+ lastName);
        System.out.println("Age : "+ age);
        System.out.println();
    }

    static void print(){
        System.out.println();
        System.out.println("Static Method : ");
        System.out.println("FirstName : "+ firstName);
        System.out.println("LastName : "+ lastName);
        System.out.println("Age : "+ age);
        System.out.println();

    }

    public static void main(String[] args) {
        print();
        System.out.println();
        System.out.println("Print in main method : ");
        System.out.println("FirstName : "+ firstName);
        System.out.println("LastName : "+ lastName);
        System.out.println("Age : "+ age);
    }

}
