package Questions.Question7;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    Q7 . Use Of method to create List, Set and Map
 */
public class Question7 {
    public static void main(String[] args) {
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Set.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Map.of(1,2,3,4,5,6,7,8,9,10));

    }
}

/*
    OUTPUT

        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        [5, 6, 7, 8, 9, 10, 1, 2, 3, 4]
        {3=4, 5=6, 7=8, 9=10, 1=2}

 */
