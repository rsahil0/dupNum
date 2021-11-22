import java.util.*;
import java.util.stream.*;

public class duplicateNum {

    public static <T> Set<T>
    findDuplicateInStream(List<T> list)
    {

        return
                list.stream()
                        .filter(i -> Collections.frequency(list, i) > 1)

                        // And Collect them in a Set
                        .collect(Collectors.toSet());
    }

    // Driver code
    public static void main(String[] args)
    {

        // Initial stream
        List<Integer> list
                = Arrays.asList(5, 10, 4,
                21, 10, 27,
                2, 52, 52, 34);

        System.out.println(
                findDuplicateInStream(list));
    }
}
