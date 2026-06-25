package OOPS;

class calc{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }
}

class Advcalc extends calc{
    public int mul(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1, int n2){
        return n1/n2;
    }
}

class VeryAdvcalc extends Advcalc{
    public double pow(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

public class inheritance {
    public static void main(String[] args) {
        VeryAdvcalc r2 = new VeryAdvcalc();
        System.out.println(r2.add(3,4) + " " + r2.mul(3,4) + " " + r2.pow(2,3));
    }
}
