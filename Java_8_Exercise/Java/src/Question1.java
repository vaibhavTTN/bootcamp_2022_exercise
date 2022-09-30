/*
* Q1) Write the following a functional interface and implement it using lambda:
*
*   First number is greater than second number or not Parameter (int ,int ) Return boolean
*   Increment the number by 1 and return incremented value Parameter (int) Return int
*   Concatination of 2 string Parameter (String , String ) Return (String)
*   Convert a string to uppercase and return . Parameter (String) Return (String)
*
*/

import java.util.function.*;

public class Question1 {
    public static void main(String[] args) {
//        First number is greater than second number or not Parameter (int ,int ) Return boolean
        BiPredicate<Integer,Integer> Predicate = (a,b)-> a>b;
        System.out.println("First number is greater than second number :: "+Predicate.test(5,6));

//        Increment the number by 1 and return incremented value Parameter (int) Return int
        Function<Integer,Integer> Increment = (a)-> a++;
        System.out.println("Incrementing the number by 1 :: "+Increment.apply(10));

//        Concatination of 2 string Parameter (String , String ) Return (String)

        BiFunction<String,String,String> Concatination = (str1,str2)-> str1+str2;
        System.out.println("Concatination of 2 string :: "+Concatination.apply("vaibhav ","kamal"));

//        Convert a string to uppercase and return . Parameter (String) Return (String)

        Function<String,String> uppperCase = (str1)-> str1.toUpperCase();
        System.out.println("String to uppercase :: "+uppperCase.apply("india"));
    }


}

//      OUTPUTS
/*
*   First number is greater than second number :: false
*   Incrementing the number by 1 :: 10
*   Concatination of 2 string :: vaibhav kamal
*    String to uppercase :: INDIA
 */