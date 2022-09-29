//Write Java code to define List .
// Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {

    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();

        list.add(5.3F);
        list.add(6.4F);
        list.add(9.1F);
        list.add(7.1F);
        list.add(5.2F);

        Iterator<Float> iterate = list.iterator();
        float sum = 0F;

        while(iterate.hasNext()){
            sum += iterate.next();
        }

        System.out.println("Sum of float List : "+ sum+"\n");
    }
}

