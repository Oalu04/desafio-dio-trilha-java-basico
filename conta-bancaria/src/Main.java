import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    private final static Conta conta = new Conta();
    private static Scanner scan = new Scanner(System.in);

    static void painel() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Digite uma das opções a seguir: \n");
        System.out.printf("%-35s%-10s\n", "1 - Consultar saldo", "4 - Sacar dinheiro");
        System.out.printf("%-35s%-10s\n", "2 - Consultar cheque especial", "5 - Pagar um boleto");
        System.out.printf("%-35s%-10s\n", "3 - Depositar dinheiro", "6 - Verificar se a conta esta usando cheque especial\n");
        System.out.printf("0 - Sair\n");
        
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    
    static void consultarSaldo() {
        System.out.println("O seu saldo atual é de " + conta.getSaldo());
    }
    

    static void consultarCheque() {
        var cheque = conta.getChequeEspecial();
        System.out.println("Seu cheque especial atual é de " + cheque);
    }

    static void depositarDinheiro() {
        double deposito; 
        System.out.printf("Digite o valor a ser depositado: ");
        deposito = scan.nextDouble();
        System.out.println("Valor depositado");
        conta.setDeposito(deposito);
    }

    static void sacarDinheiro(){
        double saque; 
        System.out.printf("Digite o valor a ser sacado: ");
        saque = scan.nextDouble();
        conta.setSaque(saque);
    }

    static void pagarBoleto(){
        System.out.println("Boleto gerado: "); 
        System.out.println("Valor do boleto: " + conta.getBoleto());
        conta.verificarPagamento();
    }

    
    public static void main(String[] args) throws Exception {
        conta.setSaldo(ThreadLocalRandom.current().nextInt(100, 1000));
            conta.setBoleto(ThreadLocalRandom.current().nextInt(100, 1500));
            int escolha = -1;
        painel();
        
        do {
            escolha = scan.nextInt();
            switch (escolha) {
                case 1 -> consultarSaldo();
                case 2 -> consultarCheque();
                case 3 -> depositarDinheiro();
                case 4 -> sacarDinheiro();
                case 5 -> pagarBoleto();
                case 6 -> conta.verificarChequeEspecial();                
            }
        } while (escolha != 0);

    }
}
