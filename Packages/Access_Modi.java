package Packages;

import Packages.tools.*;

class A extends Calc{
    public void a(){
        System.out.println(marks);
    }
}

public class Access_Modi {
    public static void main(String[] args) {
        A b = new A();
        b.a();
    }
    
    
}


// methods should be public if they want to access outside the current package
// private can be used from same class
// default will be default access modifier which can access in same package
//