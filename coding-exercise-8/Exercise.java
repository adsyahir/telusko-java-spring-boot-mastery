interface Machine {
    String start();
}


abstract class Appliance implements Machine{
    private String name;
    public Appliance(String n)
    {
        this.name = n;
    }

}
class Fan extends Appliance{
        private String name;

     public Fan(String name) {
        super(name);
    }
    public String start(){
        return "Fan is running";
    }
}

class WashingMachine extends Appliance{
     public WashingMachine(String name) {
        super(name);
    }

    public String start() {
        return "Washing Machine is operating";
    }

}

public class Exercise {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");
        
        System.out.println(fan.start());
        System.out.println(washer.start());

    }
}