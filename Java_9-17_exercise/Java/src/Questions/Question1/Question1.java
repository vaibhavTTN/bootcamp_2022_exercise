package Questions.Question1;
/*
    Q1. Demonstrate the use of private methods in interfaces
 */


public class Question1 implements StringOperationInterface{
    public static void main(String[] args) {
        Question1 obj = new Question1();
        obj.method("Vaibhav");
    }
}


/*
    OUTPUT

        vahbiaV
        VAIBHAV
        vaibhav


 */