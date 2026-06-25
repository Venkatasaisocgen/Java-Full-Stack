package OOPS;

class A {
    int x;

    A(int x) {
        this.x = x; 
        System.out.println("Parent constructor: x = " + x);
    }

    void show() {
        System.out.println("Parent show method: x = " + x);
    }
}

class B extends A {
    int x;

    B(int x, int y) {
        super(x);       
        this.x = y;    
        System.out.println("Child constructor: x = " + y);
    }

    void display() {
        System.out.println("super.x = " + super.x); 
        System.out.println("this.x = " + this.x);   
    }

    void show() {
        super.show();  
        System.out.println("Child show method");
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {

        B obj = new B(10, 20);

        obj.display();
        obj.show();
    }
}