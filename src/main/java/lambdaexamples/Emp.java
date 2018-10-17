package lambdaexamples;

public class Emp {
    int i=0;

    public Emp(int i) {
        i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "i=" + i +
                '}';
    }

    public static void main(String[] args) {
        Emp emp=new Emp(10);
        emp.getI();
        System.out.println(emp);
    }
}
