import java.util.Scanner;


public class Main {
    public static void main (String args[]){
        int op;
        Exercicios e = new Exercicios();
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("=== Bem vindo ao Lab0 ===");
        System.out.println("Escolha um exercicio:");
        System.out.println("1. Exercicio 1");
        System.out.println("2. Exercicio 2");
        System.out.println("3. Exercicio 3");
        System.out.println("4. Exercicio 4 e 5");
        System.out.println("5. Somente o exercicio 5");
        System.out.println("6. Exercicio 6");
        System.out.println("7. Exercicio 7");
        System.out.println("8. Exercicio 8");
        System.out.println("9. Exercicio 9");
        System.out.println("0.Sair");
        System.out.printf("Digite a opcao: ");
        op = in.nextInt();
        System.out.printf("\n");

        switch (op){
            case 1: e.primeiroExercicio(); break;
            case 2: e.segundoExercicio();break;
            case 3: e.terceiroExercicio(); break;
            case 4: e.quartoExercicio();break;
            case 5: e.quintoExercicio();break;
            case 6: e.sextoExercicio();break;
            case 7: e.setimoExercicio();break;
            case 8: 
                    System.out.println(e.calcularProximaOlimpiada());  
                    e.pressToUnpause(); break;
            case 9: System.out.println("Demonstracao feita por meio deste menu!!"); 
                    e.pressToUnpause();break;
            case 0: in.close(); System.exit(1); break;
            default: break;}
        }
    }

}
