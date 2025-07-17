import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try {
            var scan = new Scanner(System.in);
            int num; 
            int mult;
            System.out.printf("Digite um numero de 1 a 10: ");
            num = scan.nextInt();
            if(num == 0) {
                throw new ZeroInputException();
                
            }
    
            for(int i = 1; i <= 10; i++) {
                mult = num * i;  
                System.out.println(mult); 
            }
            scan.close(); 
            
        } catch (InputMismatchException e) {
            System.err.println("Não aceitamos letras em uma tabuada.");
        } catch(ZeroInputException e) {
            System.err.println("Zeros não são permitidos.");
        }
        
    }
}
