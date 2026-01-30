import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8, 9);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n-> n * 2);
        // int result = s3.reduce(0, (n1, n2) -> n1 + n2);
         int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (n1, n2) -> n1 + n2);
        
        // int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(result);

    }
}