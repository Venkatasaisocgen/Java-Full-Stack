package OOPS;

class human{
    private String name = "Sai";

    public String getname(){
        return name;
    }

    public String setname(String i){
        name = i;
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        human a = new human();
        System.out.println(a.getname());
        System.out.println(a.setname("Venkat"));
    }
}
