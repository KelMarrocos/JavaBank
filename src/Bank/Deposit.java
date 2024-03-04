package Bank;

import java.util.Random;
import java.util.Scanner;

public class Deposit {
    Dice dice = new Dice();

    public void depositB() {


    Random rd = new Random();
    Scanner am = new Scanner(System.in);

    System.out.println("Quanto deseja depositar? ");
    dice.storage = am.nextInt();

    Cliente.cash = Cliente.cash + dice.storage;

        System.out.println("\n A quantidade de: "+ dice.storage + " foi adicionada a sua conta, "+Cliente.name);
        System.out.println("ID de transação " + rd.nextInt(200000 + 1));
        System.out.println("Muito Obrigado pela prefêrencia\n");

        Choices Choices = new Choices();
        Choices.choices();
}
}
