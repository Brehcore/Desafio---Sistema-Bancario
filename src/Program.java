import Entities.contaCorrente;
import Entities.contaPoupanca;
import Repositories.conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        conta cc = new contaCorrente();
        conta cp = new contaPoupanca();

        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma operação: ");
            System.out.println("1. Ver extrato das contas");
            System.out.println("2. Depositar na conta corrente");
            System.out.println("3. Depositar na conta poupança");
            System.out.println("4. Saque conta corrente");
            System.out.println("5. Saque conta poupança");
            System.out.println("6. Transferir da conta corrente para poupança");
            System.out.println("7. Transferir da conta poupança para conta corrente");
            System.out.println("8. Sair");

            // Tratamento da exceção InputMismatchException em caso de escolha de alguma opção inválida
            try {
                int opcao = sc.nextInt();

                switch (opcao) {
                    // Mostra o extrato da conta corrente e da conta poupança
                    case 1:
                        cc.imprimirExtrato();
                        System.out.println();
                        cp.imprimirExtrato();
                        System.out.println("Deseja encerrar a transação? [S - Sim] [N - Não]");
                        char opcao1 = sc.next().charAt(0);
                        if (opcao1 == 'S' || opcao1 == 's') {
                            sair = true;
                            System.out.println("Operação finalizada com sucesso!");
                        }
                        break;
                    case 2:
                        // Solicita um deposito na conta corrente
                        System.out.println("Insira o valor a ser depositado: ");
                        cc.depositar(sc.nextDouble());
                        cc.imprimirExtrato();
                        System.out.println("Deseja encerrar a transação? [S - Sim] [N - Não]");
                        char opcao2 = sc.next().charAt(0);
                        if (opcao2 == 'S' || opcao2 == 's') {
                            sair = true;
                            System.out.println("Operação finalizada com sucesso!");
                        }
                        break;
                    case 3:
                        // Solicita um deposito na conta poupança
                        System.out.println("Insira o valor a ser depositado: ");
                        cp.depositar(sc.nextDouble());
                        cp.imprimirExtrato();
                        System.out.println("Deseja encerrar a transação? [S - Sim] [N - Não]");
                        char opcao3 = sc.next().charAt(0);
                        if (opcao3 == 'S' || opcao3 == 's') {
                            sair = true;
                            System.out.println("Operação finalizada com sucesso!");
                        }
                        break;
                    case 4:
                        // Solicita um saque na conta corrente
                        System.out.println("Insira o valor a ser sacado: ");
                        cc.sacar(sc.nextDouble());
                        cc.imprimirExtrato();
                        System.out.println("Deseja encerrar a transação? [S - Sim] [N - Não]");
                        char opcao4 = sc.next().charAt(0);
                        if (opcao4 == 'S' || opcao4 == 's') {
                            sair = true;
                            System.out.println("Operação finalizada com sucesso!");
                        }
                        break;
                    case 5:
                        // Solicita um saque na conta poupança
                        System.out.println("Insira o valor a ser sacado: ");
                        cp.sacar(sc.nextDouble());
                        cp.imprimirExtrato();
                        System.out.println("Deseja encerrar a transação? [S - Sim] [N - Não]");
                        char opcao5 = sc.next().charAt(0);
                        if (opcao5 == 'S' || opcao5 == 's') {
                            sair = true;
                            System.out.println("Operação finalizada com sucesso!");
                        }
                        break;
                    case 6:
                        // Transfere da conta corrente para conta poupança
                        System.out.println("Insira o valor a ser transferido: ");
                        cc.transferir(sc.nextDouble(), cp);
                        cc.imprimirExtrato();
                        System.out.println("Deseja encerrar a transação? [S - Sim] [N - Não]");
                        char opcao6 = sc.next().charAt(0);
                        if (opcao6 == 'S' || opcao6 == 's') {
                            sair = true;
                            System.out.println("Operação finalizada com sucesso!");
                        }
                        break;
                    case 7:
                        // Transfere da conta poupança para conta corrente
                        System.out.println("Insira o valor a ser transferido: ");
                        cp.transferir(sc.nextDouble(), cc);
                        cp.imprimirExtrato();
                        System.out.println("Deseja encerrar a transação? [S - Sim] [N - Não]");
                        char opcao7 = sc.next().charAt(0);
                        if (opcao7 == 'S' || opcao7 == 's') {
                            sair = true;
                            System.out.println("Operação finalizada com sucesso!");
                        }
                        break;
                    case 8:
                        // Encerra o programa
                        sair = true;
                        System.out.println("Operação finalizada com sucesso!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Posição inválida!");
                break;
            }
        }
        sc.close();

    }
}
