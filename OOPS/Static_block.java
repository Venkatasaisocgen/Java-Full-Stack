package OOPS;

class mobile2{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("In Static");
    }

    public mobile2(){
        brand="";
        price =200;
        System.out.println("in cons");

    }



    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }
}


public class Static_block {

    public static void main(String[] args) {

            mobile2 obj = new mobile2();
            obj.brand="apple";
            obj.price=20;
            mobile2.name="17pro";

            mobile2 obj1 = new mobile2();
            obj1.brand="apple";
            obj1.price=20;
            mobile2.name="17promax";

            obj.show();
            obj1.show();
        
    }
}