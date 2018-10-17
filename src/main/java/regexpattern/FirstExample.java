package regexpattern;

public class FirstExample {
    public static void main(String[] args) {

        String data = "Apple       IBM            MicroSoft  Intel";
        String[] companies = data.split("\\s+");

        String adata = "MHdata";
        String[] platts = adata.split("[^(M]H");

        for (String string:platts){
            System.out.println(string);
        }

        for (String str:companies){
            System.out.println(str);
        }
    }
}
