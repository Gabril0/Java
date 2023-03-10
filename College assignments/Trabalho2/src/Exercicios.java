import java.io.*;
import java.util.Scanner;

public class Exercicios {

    public void exercicio1(){
        for(int i = 1; i <= 3; i++) {
            try {
                System.out.printf("Arquivo" + i + ".txt tem ");
                Reader reader = new FileReader("C:\\Users\\12111bsi204\\IdeaProjects\\Trabalho2\\src\\arquivo" + 1 + ".txt");
                LineNumberReader numberReader = new LineNumberReader(reader);
                System.out.println(numberReader.getLineNumber() + " linhas");
            }
            catch (Exception e){
                throw new FileErrorException();
            }

        }
    }
}
