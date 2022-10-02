package Questions.Question8;

import java.util.Scanner;

/*
    Q8 .  Demonstrate the use AutoCloseable
 */

class A implements AutoCloseable{

    public A(){
        System.out.println("A object is created");
    }
    @Override
    public void close() throws Exception {
        System.out.println("A is closed");
    }
}

class B implements AutoCloseable{
    public B(){
        System.out.println("B Object is Created");
    }
    @Override
    public void close() throws Exception {
        System.out.println("B is closed");
    }
}
public class Question8 {
    public static void main(String[] args) {
        try(
                A a = new A();
                B b = new B();
                Scanner sc = new Scanner(System.in)
        ){
            System.out.println("Enter the number");
            int n = sc.nextInt();
            System.out.println("Entered number is :: "+ n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
