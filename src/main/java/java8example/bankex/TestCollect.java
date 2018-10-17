package java8example.bankex;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.summingDouble;

public class TestCollect {
    public static void main(String[] args) {

        Stream<Account> myStream=
                Stream.of(new Account(1,"Checking",100,"NY"),new Account(2,"Savings",250,"NY"),
                        new Account(3,"Checking",300,"NY"),new Account(4,"Checking",150,"vegas")
                );
        Stream<Account> BalnceStream=
                Stream.of(new Account(1,"Checking",100,"NY"),new Account(2,"Savings",250,"NY"),
                        new Account(3,"Checking",300,"NY"),new Account(4,"Checking",150,"vegas")
                );

        Stream<Account> accountStream=
                Stream.of(new Account(1,"Checking",100,"NY"),new Account(2,"Savings",250,"NY"),
                        new Account(3,"Checking",300,"NY"),new Account(4,"Checking",150,"vegas")
                );
        Stream<Account> accountStream1=
                Stream.of(new Account(1,"Checking",100,"NY"),new Account(2,"Savings",250,"NY"),
                        new Account(3,"Checking",300,"NY"),new Account(4,"Checking",150,"vegas")
                );

        try {
            //Provide List of all Checking accounts
            List<Integer> result = accountStream.filter(e->e.getType().equals("Checking"))
                    .map(e->e.getId())
                    .collect(Collectors.toList());
            System.out.println("Checking Accounts are :"+result);
        }catch (Exception e){
            System.out.println("No records found");
        }

        try {
            //Provide distint list of cities
            Set<String> result2 =accountStream1.map(c->c.getCity()).collect(Collectors.toSet());
            System.out.println(result2);
        }catch (Exception e){
            System.out.println("No city found");
        }
        try{
            // Provide a sum of Checking Balances
            double resulof = myStream.filter(b->b.getType().equals("Checking"))
                                .collect(summingDouble(Account::getBalance));
            System.out.println(resulof);
        }catch (Exception e){
            System.out.println("Balances not Found: ");
        }
        try{
            //find account with max balance
            Optional<Account> balanceAmt = BalnceStream.collect(minBy(Comparator.comparing(Account::getBalance)));
            System.out.println("Maximum Balance is :"+balanceAmt);

        }catch (Exception e){
            System.out.println("No max balance found");
        }





    }
}
