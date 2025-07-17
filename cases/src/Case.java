import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Case {

    static int analisarCandidato(int salario) {
        int salarioBase = 2000;
        if (salarioBase > salario) {
            System.out.printf("LIGAR PARA CANDIDATO.......\n");
            return 1;
        } else if (salarioBase == salario) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA\n");
            return 2;
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS\n");
            return 0;
        }
    }

    static int valorPretendido() {
        return ThreadLocalRandom.current().nextInt(1800, 2200);
    }

    static String[] selecaoCandidatos(String[] candidatos) throws NotEnoughDataException, InvalidInputException {
        Scanner scan = new Scanner(System.in);
        String candidatosSelecionados[] = new String[5];
        int contador = 0;

        for (int i = 0; i < candidatos.length; i++) {
            int salarioPretendido = valorPretendido();
            int verificacao = analisarCandidato(salarioPretendido);
            if (contador == 5) {   
                break;
            }
            switch (verificacao) {
                case 1: {
                    System.out.printf("Parabens candidato %s você foi selecionado para a vaga.\n\n", candidatos[i]);
                    candidatosSelecionados[contador] = candidatos[i];
                    contador++;
                    break;
                }

                case 2: {

                    System.out.printf("Candidato, %s nossa proposta é de 2000, irá aceitar?", candidatos[i]);
                    String resposta = scan.next();

                    if (resposta.equals("sim")) {
                        candidatosSelecionados[i] = candidatos[i];
                    }

                    else if (resposta.equals("nao")) {
                        continue;
                    }

                    else {
                        throw new InvalidInputException();
                    }
                    break;
                }
            }

        }

        for (int x = 0; x < candidatosSelecionados.length; x++) {
            if (candidatosSelecionados[x] == null) {
                throw new NotEnoughDataException();
            }
            
            scan.close();
        }
        return candidatosSelecionados;
    }

    public static void main(String[] args) throws Exception {
        String candidatos[] = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MATEUS", "FABRICIO", "MONICA",
                "AUGISTO", "PEDRO" };

        try {
            String[] selecionados = selecaoCandidatos(candidatos);

            System.out.println("Parabens aos selecionados: ");
            for (int i = 0; i < selecionados.length; i++) {
                System.out.printf("%s ", selecionados[i]);

            }
        } catch (NotEnoughDataException e) {
            System.out.println("Número de candidatos insuficiente.");
        }

        catch (InvalidInputException e) {
            System.err.println("Digite com \"sim\" ou \"nao\".");
        }
    }
}
