import java.util.Scanner;

public class App {

    private final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option;
        GeometricForm geometricForm = null;
        while (true) {
            System.out.println("Escolha a forma geométrica para calcuar a área");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair do programa");
            option = scan.nextInt();
            if (option == 1) {
                geometricForm = createSquare();
            } else if (option == 2) {
                geometricForm = createRectangle();
            } else if (option == 3) {
                geometricForm = createCircle();
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("O resultado da área foi de " + geometricForm.getArea());

        }

    }

    private static GeometricForm createSquare() {
        System.out.println("Infomre o tamanho dos lados");
        var side = scan.nextInt();
        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.println("Infomre o tamanho dos lados");
        var base = scan.nextDouble();
        System.out.println("Informe a altura: ");
        var height = scan.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Infomre o raio");
        var radius = scan.nextDouble();
        return new Circle(radius);
    }
}
