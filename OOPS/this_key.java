package OOPS;

class marks{
    private int maths;
    private int chem;

    public int exam (int i){
        this.maths=i;
        this.chem=i+10;
        int total=maths+chem;
        return total;
    }
}

public class this_key {
    public static void main(String[] args) {

        marks neet = new marks();
        System.out.println(neet.exam(10));
        marks jee = new marks();
        System.out.println(jee.exam(20));
        
    }
}
