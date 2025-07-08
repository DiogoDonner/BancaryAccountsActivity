//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account a1 = new CheckingAccount("Deivid", 0.0);
        Account a2 = new InvestmentAccount("Pedro", 50.0);
        Account a3 = new SavingsAccount("Amanda", 10.0);

        a1.deposit(100.0);
        a1.showData();
        a2.withdraw(10.00);
        a2.showData();

//        List<Account> accounts = new ArrayList<>(); ADD UM POR UM EM ARRAYLIST
//        accounts.add(a1);
        List<Account> accounts = List.of(a1, a2, a3);
        bank.executeRoutine(accounts);

        INotificador notificador = new NotificadorEmail();
        Bank bank1 = new Bank(notificador);
        bank1.processar();


    }
}