package OOPS;

class C{
    public void show(){
        System.out.println("in C show");
    }
}

class D extends C{
    @Override
    public void show(){
        System.out.println("in D show");
    }
}

public class Methidoverriding {
    public static void main(String[] args) {
        D obj1 = new D();
        obj1.show();
    }
}
