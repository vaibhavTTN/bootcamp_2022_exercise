package Questions.Question2;

import java.util.stream.IntStream;

/*
    Q2. Perform takeWhile and dropWhile operations on stream
 */
public class Question2 {
    public static void main(String[] args) {

        // TakeWile take the value unless it condition true

        IntStream.rangeClosed(1,20)
                .takeWhile(e->e<=15)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println();

        // DropWhile does not take the value unless it condition true

        IntStream.rangeClosed(1,20)
                .dropWhile(e->e<=15)
                .forEach(System.out::println);
    }
}
