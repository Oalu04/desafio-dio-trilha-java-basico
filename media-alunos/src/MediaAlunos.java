import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class MediaAlunos {


    public static void main(String[] args) throws Exception {
        float grade;
        Scanner scan = new Scanner(System.in); 
        String[] students = new String[100];
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Digite o nome do aluno: ");
            students[i] = scan.next();
            
        }
        
    }
}
