import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private final static Carro carro = new Carro();

    static void painel() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("Digite uma das opções a seguir: \n");
        System.out.printf("%-35s%-10s\n", "1 - Ligar o carro", "4 - Diminuir Velocidade");
        System.out.printf("%-35s%-10s\n", "2 - Desligar o Carro", "5 - Virar pra esquerda/direita");
        System.out.printf("%-35s%-10s\n", "3 - Acelerar", "6 - Verificar velocidade ");
        System.out.printf("7 - Trocar a marcha\n\n");
        System.out.printf("0 - Sair\n");

        System.out.println("-----------------------------------------------------------------------------------------");
    }

    static void carPowerOff() {
        if(carro.getMarch() != 0) {
            System.out.println("Coloque o carro em ponto morto para desliga-lo");
        } else {
            carro.setCarState(false);
            System.out.println("Carro desligado");
        }
    }

    static void turnLeftRight() {
        Scanner scan = new Scanner(System.in);
        if(carro.verifyTurnLeftRight()) {
            String decision; 
            System.out.println("Deseja virar para esquerda ou direita? ");
            decision = scan.nextLine().toUpperCase();
            
            if(!decision.equals("ESQUERDA")  || decision.equals("DIREITA")) {
                System.out.println("Direção inválida");
            } else {
                System.out.println("Carro virado para " + decision.toLowerCase());
            }
        }       
    }

    static void chooseMarch() {
        Scanner scan = new Scanner(System.in);
        int i; 
        System.out.println("1 - Aumentar marcha: ");
        System.out.println("2 - Diminuir marcha: ");
        i = scan.nextInt();
        if (i > 6 || i < 0) {
            System.out.println("Esta não é uma marcha válida");
        } else {
            switch(i) {
                case 1 -> carro.upgradeMarch();
                case 2 -> carro.downGradeMarch();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        int escolha = -1;
        painel();

        do {
            escolha = scan.nextInt();
            switch (escolha) {
                case 1 -> {
                    if (carro.isCarState()) {
                        System.out.println("O carro já está ligado");
                    } else {
                        carro.setCarState(true);
                    }
                }
                case 2 -> {
                    if (!carro.isCarState()) {
                        System.out.println("O carro ja está Desligado");
                    } else {
                        carPowerOff();
                    }
                }
                case 3 -> carro.accelerate();
                case 4 -> carro.decelerate();
                case 5 -> turnLeftRight();
                case 6 -> System.out.println("Velocidade atual: " + carro.getSpeed() + " Km");
                case 7 -> chooseMarch();
            }
        } while (escolha != 0);
    }
}
