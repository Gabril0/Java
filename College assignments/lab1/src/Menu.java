
import java.util.Scanner;

public class Menu {
    // ATENCAO!!!! O PROGRAMA SO FUNCIONA SE VOCE INFORMAR O ABSOLUTE PATH, SE NAO O
    // READER NAO FUNCIONA, MESMO ESTANDO NA MESMA PASTA
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        Exercicios exercicios = new Exercicios();

        int op;
        while (true) {
            System.out.println("=== Bem vindo ao lab1 ===");
            System.out.println("1.Exercicio 1");
            System.out.println("2.Exercicio 2");
            System.out.println("3.Exercicio 3");
            System.out.printf("Escolha o exercicio:");
            op = in.nextInt();
            System.out.println();
            switch (op) {
                case 1:
                    exercicios.exercicio1();
                    break;
                case 2:
                    exercicios.exercicio2();
                    break;
                case 3: // rapido comentario: Em geral usar Threads deixou de 2 a 3 vezes mais rapida a
                        // execucao, as vezes executando instantaneamente
                        //Specs: intel i3 10100F
                        //       GTX 750 TI
                        //       16 RAM
                        //       SSD 
                    exercicios.exercicio3();
                    break;
                default:
                    System.out.println("Numero invalido!!");
                    break;
            }
        }
    }
}
