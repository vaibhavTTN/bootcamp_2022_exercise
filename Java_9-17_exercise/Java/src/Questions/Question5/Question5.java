package Questions.Question5;

import java.util.*;

/*
    Q5. Use ifPresentOrElse, or, orElseThrow Operations with Optional
 */
public class Question5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
                list
                .stream()
                .filter(e->e%2==0)
                .findFirst()
                        .ifPresentOrElse(System.out::println,()-> System.out.println("Value doesn't exits"));

    }
}

/*
    OUTPUT

        2

 */