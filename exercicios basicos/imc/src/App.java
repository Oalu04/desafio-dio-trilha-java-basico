import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        Double peso;
        double imc;
        Double altura;
        
        System.out.printf("Digite seu peso: ");

        peso = scan.nextDouble();

        System.out.printf("Digite sua altura: ");

        altura = scan.nextDouble();

        imc = peso / Math.pow(altura, 2);


        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }

        else if (imc >= 18.6 && imc <= 24.9 ) {
            System.out.println("Peso ideal");
        }

        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }

        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }

        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II(Severa)");
        }

        else {
            System.out.println("Obesidade grau III(Mórbida)");
        }
    }
}
