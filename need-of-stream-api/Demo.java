import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main (String a[]){

        List<Integer> nums = Arrays.asList(4,5,6,7,8,9);

        for(int n : nums){
            System.out.println(n);
        }
        nums.forEach(n -> System.out.println(n));
        // nums.add(5);
        // int sum = 0;
        // for(int n : nums){
        //     if(n%2==0){
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(sum);
    }
}

