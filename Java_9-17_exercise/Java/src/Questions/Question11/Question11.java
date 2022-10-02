package Questions.Question11;

/*
    Q11. use record to create an immutable represent of student(name, id, age) and use its  constructor for
    initialization, equals to compare 2 students methods.
    Also keep a static counter to keep the count of objects created.
 */
record Student(String name,int id,int age) {
    static int count = 0;
    Student{
        count++;
    }
}

public class Question11 {
    public static void main(String[] args) {
        Student obj = new Student("Vaibhav",1,21);
        System.out.println("Id :: "+ obj.id());
        System.out.println("Name :: "+ obj.name());
        System.out.println("Age :: "+ obj.age());
        System.out.println("Number of Object been created :: "+Student.count);
        System.out.println();
        Student obj2 = new Student("Naveen",2,21);
        System.out.println("Id :: "+ obj2.id());
        System.out.println("Name :: "+ obj2.name());
        System.out.println("Age :: "+ obj2.age());
        System.out.println("Number of Object been created :: "+Student.count);
        // we will not be able change the value of the Obj
    }
}

/*
        OUTPUT

        Id :: 1
        Name :: Vaibhav
        Age :: 21
        Number of Object been created :: 1

        Id :: 2
        Name :: Naveen
        Age :: 21
        Number of Object been created :: 2

 */