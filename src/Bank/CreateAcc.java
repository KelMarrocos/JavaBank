package Bank;

import java.util.Scanner;

public class CreateAcc {
    Dice dice = new Dice();
    Options option = new Options();

    public void createB(){
        Scanner am = new Scanner(System.in);

        System.out.println("\n Insira seus dados para acessar a conta: ");

        System.out.println("Nome: ");
        dice.nameCliente = am.next();

        System.out.println("Senha: ");
        dice.passCliente = am.next();

        while (!Cliente.name.equals(dice.nameCliente) || !Cliente.password.equals(dice.passCliente) ) {
            System.out.println("Nome ou senha incorretos, tente novamente\n");

            System.out.println("Nome: ");
            dice.nameCliente = am.next();

            System.out.println("Senha: ");
            dice.passCliente = am.next();
        }
        System.out.println("Conta Acessada com sucesso!");
        System.out.println("O que deseja fazer?\n");

        String functionACC;

        System.out.println("1- Alterar tipo de conta");
        System.out.println("2- Fechar conta");
        System.out.println("3- Voltar");
        functionACC = am.next();

        while (!functionACC.equals(option.option1) && !functionACC.equals(option.option2) && !functionACC.equals(option.option3)) {
            System.out.println("Insira um valor válido");

            System.out.println("1 - Alterar tipo de conta");
            System.out.println("2 - Fechar conta");
            System.out.println("3 - Voltar");
            functionACC = am.next();
        }

        int function = Integer.parseInt(functionACC);

        if (function == 1) {
            System.out.println("Alterando tipo de conta...");
            System.out.println("Por favor aguarde");

            if (Cliente.accountType == AccountType.CORRENTE) {
                Cliente.accountType = AccountType.POUPANCA;
            } else if (Cliente.accountType == AccountType.POUPANCA) {
                Cliente.accountType = AccountType.CORRENTE;
            }
            System.out.println("Mudança feita com sucesso!");
            System.out.println("Agora sua conta é: " + Cliente.accountType);

        } else if (function == 2) {
            System.out.println("Verificando dados na conta...");
            if (Cliente.cash != 0) {
                System.out.println("Você possui " + Cliente.cash + " na sua conta");
                System.out.println("Não podemos fechá-la");
                System.out.println("Por favor, saque o dinheiro e tente novamente");

                System.out.println("1 - Acessar minha conta");
                System.out.println("2 - Fazer um depósito");
                System.out.println("3 - Retirar uma quantia");
                System.out.println("4 - Sair\n");
                option.option = am.next();
                dice.converter = Integer.parseInt(option.option);
            } else {
                System.out.println("Fechando conta...");
                System.out.println("Conta fechada com sucesso");

                System.exit(0);
            }
        } else if (function == 3) {
            Choices Choices = new Choices();
            Choices.choices();
        }
    }
}