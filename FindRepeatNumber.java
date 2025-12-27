import java.util.*;
import java.util.stream.*;

class FindRepeatNumber {

    public static void main(String[] args) {

        int arr[] = {1, 3, 2, 4, 9, 9, 6};

        int num = FindRepeatNum(arr);
        System.out.println(num);
    }

    static int FindRepeatNum(int[] arr) {

        // Using Stream API
        int number = Arrays.stream(arr)      // converts int[] to IntStream
                .boxed()                     // IntStream → Stream<Integer>
                .collect(Collectors.groupingBy(
                        x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1) // keep duplicates
                .findFirst()
                .map(Map.Entry::getKey)        // extract number
                .orElse(-1);                   // if no duplicate

        return number;
    }
}
