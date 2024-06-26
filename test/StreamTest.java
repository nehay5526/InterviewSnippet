import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
         List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                                           "GeeksQuiz", "GeeksforGeeks"); 
        Optional<String>  longestString = words.stream().reduce((words1,words2)->words1.length()>words2.length()? words1:words2);                                   
        longestString.ifPresent(System.out::println);
        List<Integer> list = List.of(1,2,3,4,5);
        Optional<Integer> inter = list.stream().reduce((n1,n2)->n1+n2);
        inter.ifPresent(System.out::println);
        int sum = IntStream.range(2,9).reduce((num1,num2)->num1+num2).orElse(-1);
        System.out.println(sum);
    }

}
