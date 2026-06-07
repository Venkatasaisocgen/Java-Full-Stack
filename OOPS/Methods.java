package OOPS;

class shop{
    public void wel()
    {
        System.out.println("Welcome to Shop");
    }
    public String pen (int cost){
        if(cost>10){
            return "Pen";
        }
        else{
            return "need more money";
        }
    }
}

public class Methods {
    public static void main(String args[]){
        shop s=new shop();
        s.wel();
        String p = s.pen(11);
        System.out.println(p);
    }
}
