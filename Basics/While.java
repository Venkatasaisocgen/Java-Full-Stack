package Basics;

public class While {
    public static void main(String args[]){
        int x=1;

        while(x<=5){
            int y=x;
            while(y>0){
                System.out.print('*');
                y--;
            }
            System.out.println();
            x++;
        }
        
    }
}
