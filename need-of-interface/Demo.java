 interface Computer{
    public abstract void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("codi, compile, run Laptop");
    }
}
class Desktop implements Computer{ 
    public void code(){
        System.out.println("codi, compile, run Desktop");
    }
}
class Developer{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class Demo {

    public static void main(String a[]) {

        Laptop lap = new Laptop();
        Desktop desk = new Desktop();    
        Developer navin = new Developer();
        navin.devApp(lap);

    }
}