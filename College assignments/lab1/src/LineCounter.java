import java.io.*;

import javax.sound.sampled.Line;

public class LineCounter extends Thread {
    private int i;

    LineCounter(int i) {
        this.i = i;
    }

    public void lineCounterSemThreads(){
        int counter = 0;
        String absolutePath = "D:\\Estudos\\Java\\Trabalhos\\ListasPOO2\\Java\\College assignments\\lab1\\src";
        try {
            Reader reader = new FileReader(absolutePath + "\\arquivo" + i + ".txt");
            LineNumberReader numberReader = new LineNumberReader(reader);
            while (numberReader.ready()) {
                counter++;
                numberReader.readLine();
            }
            System.out.println("arquivo" + i + ".txt tem " + counter + " linhas");
        } catch (Exception e) {
            throw new FileErrorException();
        }
    }

    @Override
    public void run() {
        int counter = 0;
        String absolutePath = "D:\\Estudos\\Java\\Trabalhos\\ListasPOO2\\Java\\College assignments\\lab1\\src";
        try {
            Reader reader = new FileReader(absolutePath + "\\arquivo" + i + ".txt");
            LineNumberReader numberReader = new LineNumberReader(reader);
            while (numberReader.ready()) {
                counter++;
                numberReader.readLine();
            }
            System.out.println("arquivo" + i + ".txt tem " + counter + " linhas");
        } catch (Exception e) {
            throw new FileErrorException();
        }

    }
}