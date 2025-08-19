import cinema.*;
import java.util.Scanner;

public class Main {

    static void cinemaSetUp(Ingresso ingresso) {
        ingresso.setLanguage("Dublado");
        ingresso.setMovie("Homem Aranha");
        ingresso.setPerson(3);

        ingresso.setTicketType(ingresso.getClass().getSimpleName());

        System.out.println("O filme será " + ingresso.getMovie() + " (" + ingresso.getLanguage() + ")");
        System.out.println("O ingresso será do tipo " + ingresso.getTicketType() + " para " + ingresso.getPerson() + " pessoas");
        System.out.printf("Que ficará no valor de R$ %.2f\n", ingresso.getPrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tipo de ingresso você deseja?");
        System.out.println("1 - Inteira");
        System.out.println("2 - Meia");
        System.out.println("3 - Família");
        int opcao = sc.nextInt();

        Ingresso ingresso = null;

        switch (opcao) {
            case 1 -> ingresso = new IngressoInteira();
            case 2 -> ingresso = new IngressoMeia();
            case 3 -> ingresso = new IngressoFamilia();
            default -> {
                System.out.println("Opção inválida!");
                System.exit(0);
            }
        }

        cinemaSetUp(ingresso);

        sc.close();
    }
}
