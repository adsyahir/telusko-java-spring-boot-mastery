@FunctionalInterface
interface A{
    void show(int i);
}

public class Demo{
    public static void main(String a[]){
        A obj = (int i) -> System.out.println("in new show" + i);
        obj.show(5);
    }
}