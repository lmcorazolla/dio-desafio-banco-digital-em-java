import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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





/*        correnteLuiz.imprimirExtrato();
        poupancaLuiz.imprimirExtrato();

        correnteGiullia.imprimirExtrato();
        poupancaGiullia.imprimirExtrato();*/


    }

}
