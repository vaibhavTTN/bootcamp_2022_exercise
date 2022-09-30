// Q5)Implement multiple inheritance with default method inside interface.

interface interface1{
    default void method(){
        System.out.println("Interface1 is printed");
    }
}

interface interface2{
    default void method(){
        System.out.println("Interface2 is printed");
    }
}

interface interface3 extends interface1,interface2{

    default void multtipleInheretance(){
        System.out.println("Interface3 is invoked");
    }
    @Override
    default void method() {
        multtipleInheretance();
        interface2.super.method();
    }
}

public class Question5 implements interface3{
    public static void main(String[] args) {
        Question5 obj = new Question5();
        obj.method();
    }
}

/*
    OUTPUT

        Interface3 is invoked
        Interface2 is printed


 */