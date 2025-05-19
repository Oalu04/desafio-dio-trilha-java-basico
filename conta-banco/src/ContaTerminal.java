import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;	
        String agencia;	
        String nomeCliente;	
        double saldo = 3201.59;

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o numero da sua agencia: ");
        numero = scanner.nextInt();

        System.out.println("Digite qual a sua agencia: ");
        agencia = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponivel para saque");
    }
}
