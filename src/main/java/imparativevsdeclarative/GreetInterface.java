package imparativevsdeclarative;

public class GreetInterface {
    public static void main(String[] args) {


    }
    public static void greets(Greet greet,String string){
        System.out.println();
    }
}

interface Greet{
    void greet(String name);
}