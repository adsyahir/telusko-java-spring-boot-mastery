enum Status{
    Running, Failed, Pending, Success;
}
public class Demo{
    public static void main(String a[]) {
        Status s = Status.Running;
        if(s == Status.Running){
            System.out.println("Running");
        }else if(s == Status.Failed){
            System.out.println("Failed");
        } else if(s == Status.Pending){
            System.out.println("Pending");
        }else if(s == Status.Success){
            System.out.println("Success");
        }

        switch(s)
        {
             case Running:
                System.out.println("Running");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                System.out.println("Success");
                break;
        }
    }
}