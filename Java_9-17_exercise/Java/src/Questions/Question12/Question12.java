package Questions.Question12;

/*
    Q12. Demonstrate the use of Sealed Classes.
 */

sealed class parent permits child1,child2,child3{
    public void parentMethod(String str){
        System.out.println("Parent Method is called by :: "+str);
    }
}

final class child1 extends parent{
    child1(){
        System.out.println("Child1 Class Object is made.");
    }
}

final class child2 extends parent{
    child2(){
        System.out.println("Child2 Class Object is made");
    }
}

non-sealed class child3 extends parent{
    child3(){
        System.out.println("Child3 Class Object is made");
    }
}

class child4 extends child3{
    child4(){
        System.out.println("Child4 Class Object is made");
    }
}

public class Question12 {
    public static void main(String[] args) {
        child1 obj1 = new child1();
        child2 obj2 = new child2();
        child3 obj3 = new child3();
        child4 obj4 = new child4();
        System.out.println();
        obj1.parentMethod("obj1");
        obj2.parentMethod("obj2");
        obj3.parentMethod("obj3");
        obj4.parentMethod("obj4");
    }
}

/*
    OUTPUT

        Child1 Class Object is made.
        Child2 Class Object is made
        Child3 Class Object is made
        Child3 Class Object is made
        Child4 Class Object is made

        Parent Method is called by :: obj1
        Parent Method is called by :: obj2
        Parent Method is called by :: obj3
        Parent Method is called by :: obj4

 */