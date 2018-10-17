package regexpattern;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValDOB {
    public static void main(String[] args) {

        String dob = "23/06/2016";
        if (valDOB(dob)){
            JOptionPane.showMessageDialog(null,"Valid DOB");
        }else {
            JOptionPane.showMessageDialog(null,"Invalid DOB");
        }
    }
    public static boolean valDOB(String DOB){
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date BOD = null;
        df.setLenient(false);

        try {
            BOD = df.parse(DOB);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
