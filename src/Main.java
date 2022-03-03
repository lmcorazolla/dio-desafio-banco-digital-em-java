import java.util.Scanner;

public class Main implements IConta {

    public static void main(String[] args) {
        // Criando dois clientes
        Cliente luiz = new Cliente();
        luiz.setNome("Luiz Mateus");

        Conta correnteLuiz = new ContaCorrente(luiz);
        Conta poupancaLuiz = new ContaPoupanca(luiz);

        correnteLuiz.depositar(10000);
        correnteLuiz.transferir(8000, poupancaLuiz);

        Cliente giullia = new Cliente();
        giullia.setNome("Giullia Vênus");

        Conta correnteGiullia = new ContaCorrente(giullia);
        Conta poupancaGiullia = new ContaPoupanca(giullia);

        correnteGiullia.depositar(15000);
        correnteGiullia.transferir(8000, poupancaGiullia);

        Scanner teclado = new Scanner(System.in);
        int opcaoMenu;


        System.out.println("Bem vindo ao Banco! \nSelecione a sua opção:");
        System.out.println("1: Acessar Conta Luiz  2: Acessar Conta Giullia");
        opcaoMenu = teclado.nextInt();
        if (opcaoMenu == 1) {
            System.out.println("1: Ver saldo Corrente  2: Ver saldo Poupança");
            System.out.println("3: Depositar Corrente  4: Depositar Poupança");
            System.out.println("5: Sacar Corrente  6: Sacar Poupança");
            System.out.println("7: Transferir Corrente  8: Transferir Poupança");
            opcaoMenu = teclado.nextInt();
            if (opcaoMenu == 1) correnteLuiz.imprimirExtrato();
            else if (opcaoMenu == 2) poupancaLuiz.imprimirExtrato();
            else if (opcaoMenu == 3) {
                System.out.print("Valor Depósito: R$ ");
                double valor = Double.parseDouble(teclado.next());
                correnteLuiz.depositar(valor);
            } else if (opcaoMenu == 4) {
                System.out.print("Valor Depósito: R$ ");
                double valor = Double.parseDouble(teclado.next());
                poupancaLuiz.depositar(valor);
            } else if (opcaoMenu == 5) {
                System.out.print("Valor Saque: R$ ");
                double valor = Double.parseDouble(teclado.next());
                correnteLuiz.sacar(valor);
            } else if (opcaoMenu == 6) {
                System.out.print("Valor Saque: R$ ");
                double valor = Double.parseDouble(teclado.next());
                poupancaLuiz.sacar(valor);
            } else if (opcaoMenu == 7) {
                IConta contaDestino = null;
                System.out.print("Conta Destino: ");

                System.out.print("Valor Transferência: R$ ");
                double valor = Double.parseDouble(teclado.next());
                correnteLuiz.transferir(valor, contaDestino);
            }


        } else if (opcaoMenu == 2) {
            System.out.println("1: Ver saldo Corrente  2: Ver saldo Poupança");
            System.out.println("3: Depositar Corrente  4: Depositar Poupança");
            System.out.println("5: Sacar Corrente  6: Sacar Poupança");
            System.out.println("7: Transferir Corrente  8: Transferir Poupança");
            opcaoMenu = teclado.nextInt();
            if (opcaoMenu == 1) correnteGiullia.imprimirExtrato();
            else if (opcaoMenu == 2) poupancaGiullia.imprimirExtrato();
            else if (opcaoMenu == 3) {
                System.out.print("Valor Depósito: R$ ");
                double valor = Double.parseDouble(teclado.next());
                correnteGiullia.depositar(valor);
            } else if(opcaoMenu == 4){
                System.out.print("Valor Depósito: R$ ");
                double valor = Double.parseDouble(teclado.next());
                poupancaGiullia.depositar(valor);
            } else if(opcaoMenu == 5){
                System.out.print("Valor Saque: R$ ");
                double valor = Double.parseDouble(teclado.next());
                correnteGiullia.sacar(valor);
            } else if(opcaoMenu == 6){
                System.out.print("Valor Saque: R$ ");
                double valor = Double.parseDouble(teclado.next());
                poupancaGiullia.sacar(valor);
            }

        } else if (opcaoMenu > 2 || opcaoMenu <= 0) {
            System.out.println("Opção inválida.");
        }



/*        correnteLuiz.imprimirExtrato();
        poupancaLuiz.imprimirExtrato();

        correnteGiullia.imprimirExtrato();
        poupancaGiullia.imprimirExtrato();*/


    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {

    }
}
