import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Exercicios {
    Scanner in = new Scanner(System.in);

    public void primeiroExercicio(){
        String texto, segundoTexto;
        System.out.printf("Digite algo:");
        texto = in.nextLine();
        System.out.printf("Digite outra coisa");
        segundoTexto = in.nextLine();
        if(texto.endsWith(segundoTexto)) System.out.println("termina com os caracteres da segunda!!");
        else System.out.println("Nao termina com os caracteres da segunda!!");
    }

    public void segundoExercicio(){

    }

    public void terceiroExercicio(){
        int num, resposta;
        Random r = new Random();
        resposta = r.nextInt(100) + 1;
        System.out.printf("Digite um numero inteiro: ");
        num = in.nextInt();
        System.out.println("\n");
        if(num == resposta) System.out.println("Acertou!!");
        else System.out.println("Errou!!");
        System.out.println("O numero era " + resposta);

    }
}
