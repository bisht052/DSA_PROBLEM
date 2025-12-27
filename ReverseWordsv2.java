import java.util.Arrays;
import java.util.stream.Collectors;

class ReverseWordsv2 {
    public static void main(String[] args) {
        String str = "the sky is blue";
         // output (my thinging) :: eht yks si eulb
        String result = Arrays.stream(str.split(" "))
                              .map(word -> new StringBuilder(word).reverse().toString())
                              .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}