import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {

        int opcao;
        int tipoConta;
        Conta conta = null;

        do {
            System.out.println("TIPO DE CONTA:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Salário");
            System.out.println("3 - Conta Poupança");
            System.out.println("4 - Sair");
            Scanner menu = new Scanner(System.in);

            System.out.println("Digite o tipo de conta:");
            tipoConta = menu.nextInt();

            switch (tipoConta) {
                case 1:
                    System.out.println("Conta Corrente.");
                    conta = new ContaCorrente(1,1,"Inter",100.00,500.00);
                    break;
                case 2:
                    System.out.println("Conta Salário.");
                    conta = new ContaSalario(2,1,"Inter",1000.00,3);
                    break;
                case 3:
                    System.out.println("Conta Poupança.");
                    conta = new ContaPoupanca(3,1,"Inter",1000.00,20,0.05);
                    break;
                case 4:
                    System.out.println("Sair");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            do {
                System.out.println("OPÇÕES:");
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sair");
                Scanner menu2 = new Scanner(System.in);

                System.out.println("Digite a opção desejada: ");
                opcao = menu2.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo R$ " + conta.getSaldo() + "\n");
                        System.out.println("Sacar.");
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Digite o valor que deseja sacar:");
                        double valorSaque = scan.nextDouble();
                        conta.sacar(valorSaque);
                        System.out.println("Saldo atual R$ " + conta.getSaldo() + "\n");
                        break;
                    case 2:
                        System.out.println("Saldo R$ " + conta.getSaldo() + "\n");
                        System.out.println("Depositar.");
                        Scanner scan2 = new Scanner(System.in);
                        System.out.print("Digite o valor que deseja depositar:");
                        double valorDeposito = scan2.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Saldo atual R$ " + conta.getSaldo() + "\n");
                        break;
                    case 3:
                        System.out.println("Sair");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 3);
        } while (tipoConta != 4);
    }
}


