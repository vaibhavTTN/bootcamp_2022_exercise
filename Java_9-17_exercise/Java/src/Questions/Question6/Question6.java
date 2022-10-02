package Questions.Question6;

/*
    Q6. Convert an Optional type into Stream
 */

import java.util.Arrays;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list
                .stream()
                .filter(e->e>5)
                .findFirst()
                .stream()
                .map(e->e*10)
                .forEach(System.out::println);


    }
}

/*
    OUTPUT

        60
 */