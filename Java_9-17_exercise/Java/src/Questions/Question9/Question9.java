package Questions.Question9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Q9. Create Unmodifiable List from a Steam
 */
public class Question9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> list2 = list.stream()
                .map(e->e*2)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(list2);
        list2.add(10);
    }
}

/*
    OUTPUT
        [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

     if add the element in list :-
        Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
    	at Questions.Question9.Question9.main(Question9.java:19)

 */