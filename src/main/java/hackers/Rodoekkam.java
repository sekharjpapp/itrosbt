package hackers;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Base64;
public class Rodoekkam {
    public static void main(String[] args) {
        System.out.println("Enter your Input here..");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i=1; i<=10;i++){
            int result = i* N;
            System.out.printf("%d x %d = %d \n",N,i,result);
        }

        byte[] encodedBytes = Base64.getEncoder().encode("Test".getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));
        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
        System.out.println("decodedBytes " + new String(decodedBytes));

    }
    public static void print(int x) {
        IntStream.rangeClosed(1, x).mapToObj(i ->
                IntStream.rangeClosed(1, x).mapToObj(j ->
                        Integer.toString(i * j))
                        .collect(Collectors.joining("\t")))
                .forEach(System.out::println);
    }
}
