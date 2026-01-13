// class - class -> interface
// class - interface -> implements
// interface - interface -> extends

interface A{
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{
}
class B implements A, X{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }

}
public class Demo{
    public static void main(String a[]){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        
    }
}