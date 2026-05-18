package OOPS;

class calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

public class Class_and_objects {
    public static void main(String args[]){
        int n1=5;
        int n2=3;
        calculator c = new calculator();
        int res = c.add(n1,n2);
        System.out.println(res);
    }
}
