package Questions.Question4;

import java.util.stream.IntStream;

/*
       Q4. Use iterator stream method to generate a stream
 */
public class Question4 {
    public static void main(String[] args) {
        IntStream
                .iterate(1,e->e<=10,e->e+1)
                .forEach(System.out::println);
    }
}

/*
    OUTPUT

        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
 */