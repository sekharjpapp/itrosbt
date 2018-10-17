package designpatterns;

public class Singleton {

    private static Singleton singleInstance;

    private Singleton(){}
    public static Singleton getSingleInstance(){
        if (singleInstance == null){
            singleInstance =new Singleton();
        }
        return singleInstance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        System.out.printf(String.valueOf(singleton.hashCode()));
        System.out.println("-----------------------");
        System.out.printf(String.valueOf(singleton.hashCode()));

    }
}
