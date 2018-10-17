package imparativevsdeclarative;

import java.util.stream.IntStream;

public class ImarativeVsDeclarative {
    public static void main(String[] args) {

        /**
         * Imarative style
         */
        int sum =0;
        for(int i=0;i<=100;i++){
            sum +=i;
        }
        System.out.println("Imartive Sum " +sum);

        /**
         * Delarative sum
         *
         */
        int sum1 =IntStream.rangeClosed(0,100)
                .sum();
        System.out.println(sum1);
    }
}
