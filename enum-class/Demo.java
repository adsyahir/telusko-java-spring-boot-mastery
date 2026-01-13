enum Laptop{
    Macbook(200), XPS(2200), Surface, Thinkpad(1800);
    private int price;

    private Laptop(){
        this.price = 500;
    }
    private Laptop(int price){
        this.price = price;
        System.out.println("price : " + price);
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}

public class Demo{
    public static void main (String a[])
    {

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}