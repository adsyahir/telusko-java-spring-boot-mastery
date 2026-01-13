class A{
    public void show(){
        System.out.println("in A show");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

public class Demo{
    public static void main(String a[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("in new show");
            }
        };

        obj.show();
    }
}