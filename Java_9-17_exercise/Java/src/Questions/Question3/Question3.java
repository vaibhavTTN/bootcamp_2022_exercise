package Questions.Question3;
/*
    Q3. Use rangeClosed to create a  Stream
 */

import java.util.stream.IntStream;

public class Question3 {
    public static void main(String[] args) {
        /*
            Creating the stream using rangeClose
            which function is to returns even value
         */


        IntStream.rangeClosed(1,20)
                .filter(e->e%2==0)
                .forEach(System.out::println);
    }
}
