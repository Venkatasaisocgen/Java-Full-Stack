package Basics;

public class elseif {
    public static void main(String args[]){
        int x=5;
        int y=9;
        int z=7;
        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
}
