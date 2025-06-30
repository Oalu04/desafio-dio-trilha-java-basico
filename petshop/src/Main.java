import java.util.Scanner;   
public class Main {
    private final static Scanner scan = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) throws Exception {
        scan.useDelimiter("\\n");
        var option = -1;

        do {
            System.out.println("===Escolha uma das opcoes===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com agua");
            System.out.println("3 - Abastecer a maquina com shampoo");
            System.out.println("4 - Verifica agua da maquina");
            System.out.println("5 - Verifica shampoo da maquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("0 - Sair");
            option = scan.nextInt();    

            switch (option) {
                case 1 -> petMachine.takeShower();
                case 2 -> setWater(); 
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();           
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine(); 
                case 8 -> petMachine.removePet();    
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (true);
    }

    private static void setWater() {
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A maquina esta no momento com " + amout + "litro(s) de agua");
    }
    
    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("A maquina esta no momento com " + amout + "litro(s) de shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina" : "Não tem pet na maquina");
    }

    public static void setPetInPetMachine() {
        var name = "";

        while(name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scan.next();
            
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
        
    }

    
}
