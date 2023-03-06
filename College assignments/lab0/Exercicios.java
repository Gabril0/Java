import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.HashMap;
import java.util.Arrays;  

public class Exercicios {
    Scanner in = new Scanner(System.in);

    public void primeiroExercicio(){
        String texto, segundoTexto;
        System.out.printf("Digite algo:");
        texto = in.nextLine();
        System.out.printf("Digite outra coisa: ");
        segundoTexto = in.nextLine();
        if(texto.endsWith(segundoTexto)) System.out.println("termina com os caracteres da segunda!!");
        else System.out.println("Nao termina com os caracteres da segunda!!");
        pressToUnpause();
    }

    public void segundoExercicio(){
        HashMap<Character,Integer> hm = new HashMap<>();
        String palavra;

        System.out.printf("Digite uma palavra: ");
        palavra = in.nextLine();
        for(int i = 0; i  < palavra.length(); i++){
            char cast = palavra.charAt(i);
            if(hm.containsKey(cast)) hm.put(cast, (hm.get(cast) + 1));
            else hm.put(cast, 1);
        }
        System.out.println(hm);
        pressToUnpause();
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
        pressToUnpause();
    }

    public void quartoExercicio(){
        Atleta novoAtacante = new Atacante("Josh", 25, 78.5f, 1.82f);
        novoAtacante.aquecer(13);
        novoAtacante.jogar();
        System.out.println(novoAtacante.toString());
        pressToUnpause();
    }

    public void quintoExercicio(){
        Atleta novoAtacante = new Atacante("Bob", 29, 95.4f, 1.90f);
        System.out.println(novoAtacante.toString());
        pressToUnpause();
    }

    public void sextoExercicio(){
        Atleta novoAtacante = new Atacante("Thurston", 27, 68.9f, 2.01f);
        Atleta novoTenista = new Tenista("Thom", 36, 85.5f, 1.68f);
        Atleta novoCorredor = new Corredor("Kevin", 21, 60.2f, 1.72f);

        for(int i = 0; i < 3; i++ ){
            novoAtacante.jogar();
            novoCorredor.jogar();
            novoTenista.jogar();
        }
        pressToUnpause();
    }

    public void setimoExercicio(){
        Atleta[] array = new Atleta[10];
        ArrayList <Atleta> arrayList = new ArrayList<>();
        array[1] = new Atacante("Thurston", 27, 68.9f, 2.01f);
        array[2] = new Tenista("Thom", 36, 85.5f, 1.68f);
        array[3] = new Corredor("Kevin", 21, 60.2f, 1.72f);

        arrayList.add(new Atacante("Thurston", 27, 68.9f, 2.01f));
        arrayList.add(new Tenista("Thom", 36, 85.5f, 1.68f));
        arrayList.add(new Corredor("Kevin", 21, 60.2f, 1.72f));

        Collections.sort(arrayList);
        Arrays.sort(array);
        System.out.println("For array comum: ");
        for (int i = 1; i <= 3; i++) 
        {
            array[i].aquecer(5);
            array[i].jogar();
        }
        System.out.println("For array list: ");
        for (Atleta atleta : arrayList) {
            atleta.aquecer(3);
            atleta.jogar();
        }
        pressToUnpause();
    }
    public static Date calcularProximaOlimpiada(){
        Exercicios e = new Exercicios(); //utilizado somente para a pausa
        LocalDateTime ldt = LocalDateTime.now();
        Date resultado;
        LocalDate lc;
        int primeiraOlimpiada, esteAno;
        Integer calculo;
        primeiraOlimpiada =  1896;
        esteAno = ldt.getYear();
        calculo = primeiraOlimpiada;
        while(calculo<esteAno){
            calculo = calculo + 4;
        }
        lc = LocalDate.parse(calculo.toString() + "-" + "06-04");
        resultado = java.sql.Date.valueOf(lc);
        return resultado;

    }

    public void pressToUnpause(){
        Scanner b = new Scanner(System.in);
        String buffer;
        System.out.println("Digite qualquer coisa para despausar!");
        buffer = b.nextLine();// ajudando a nao dar erro de buffer
    }
}
