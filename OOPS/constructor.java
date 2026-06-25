package OOPS;

class xyz{

    // String Name;
    
    // public xyz(String name) {
    //     Name = name;
    // }
    public xyz(int a){
        System.out.println("in constructor" + a);
    }

}

public class constructor {
    public constructor() {
    }

    public static void main(String[] args) {
        xyz a = new xyz(2);
        System.out.println(a);
        xyz b = new xyz(3);
        System.out.println(b);
    }
}
