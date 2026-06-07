package OOPS;

class calculator2{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2,int n3){
        return n1+n2+n3;
    }
}

public class Method_overloading {
    public static void main(String args[]){
        int n1=5;
        int n2=3;
        // int n3=7;
        calculator2 c = new calculator2();
        int res = c.add(n1,n2);
        // int res = c.add(n1,n2);
        // int res = c.sub(n1,n2);
        // int res = c.div(n1,n2);
        System.out.println(res);
    }
}
