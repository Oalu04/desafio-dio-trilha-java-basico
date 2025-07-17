// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        // TODO: Implemente a classificação do cliente com base no saldo:
        if(saldo >= 0 && saldo <= 500) {
          System.out.printf("Baixo");
        }
        
        else if(saldo < 0) {
          System.out.printf("Negativado");
        }
        
        else{
          System.out.printf("Confortavel");
        }

        scanner.close();
    }
}