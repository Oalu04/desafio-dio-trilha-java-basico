import java.util.Scanner;

public class Contador {

    static void contar (int parameter1, int parameter2) throws InvalidParametersException {
        if (parameter1 > parameter2) {
            throw new InvalidParametersException();
        }
        for (int i = parameter1; i <= parameter2; i++) {
            System.out.printf("Imprimindo o numero %d\n", i);
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Scanner scan = new Scanner(System.in); 
            System.out.printf("Digite o primeiro numero: ");
            int num1 = scan.nextInt();
            System.out.printf("Digite o segundo numero: ");
            int num2 = scan.nextInt();
    
            contar(num1, num2);
        } catch (InvalidParametersException e){
            System.out.println("O primeiro numero nao pode ser maior que o segundo.");
        }
    }
}
