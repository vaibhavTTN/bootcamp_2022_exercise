/*

Q2) Using (instance) Method reference create and
    apply add and subtract method and using (Static) Method
    reference create and apply multiplication
    method for the functional interface created

 */

interface referenceMethodInterface{
    public void calculate(int a,int b);
}
class Calculate{
    public static void multiply(int a, int b){
        System.out.println("Multiplication of a and b :: " + (a*b) );
    }
    public void subtract(int a,int b){
        System.out.println("Substract a and b :: "+(a-b));
    }
    public void addition(int a,int b){
        System.out.println("Adding a and b :: "+(a+b));
    }
}

public class Question2 {
    public static void main(String[] args) {

        referenceMethodInterface add = new Calculate()::addition;
        add.calculate(5,4);

        referenceMethodInterface sub = new Calculate()::subtract;
        sub.calculate(5,4);

        referenceMethodInterface multiplyOperation = Calculate::multiply;
        multiplyOperation.calculate(5,4);
    }

}
/*
    OUTPUT

        Adding a and b :: 9
        Substract a and b :: 1
        Multiplication of a and b :: 20
 */