package OOPS;

class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class Static_var {
    public static void main(String a[]){
         mobile obj = new mobile();
         obj.brand="apple";
         obj.price=20;
         mobile.name="17pro";

         mobile obj1 = new mobile();
         obj1.brand="apple";
         obj1.price=20;
         mobile.name="17promax";

         obj.show();
         obj1.show();
    }
}
