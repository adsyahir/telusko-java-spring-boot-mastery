import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String a[]) throws IOException {
        System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        
        // Can a use a reader or a scanner class
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);
    }
}