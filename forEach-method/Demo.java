import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
    public static void main(String a[]) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8, 9);

        nums.forEach(n -> System.out.println(n));
    }
}