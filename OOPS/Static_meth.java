package OOPS;

class Mobile{

    String name;
    static String model="promax";

    public static void show (Mobile obj){
        System.out.println(obj.name + model);
    }
}

public class Static_meth {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.name="apple";

        Mobile.show(obj);
    }
}
