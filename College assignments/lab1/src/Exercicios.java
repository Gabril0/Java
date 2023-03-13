import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicios {

    public void exercicio1() {
        long time;
        LineCounter[] lineThreads = new LineCounter[4];
        time = System.currentTimeMillis();
        for (int i = 1; i < 4; i++) {
            lineThreads[i] = new LineCounter(i);
            lineThreads[i].start();
        }
        System.out.println("Tempo de execucao(millis):" + (time = time - System.currentTimeMillis())*-1);
        pressToUnpause();
    }

    public void exercicio2() {
        long time;
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(100);
        time = System.currentTimeMillis();
        for (int i = 1; i < 4; i++) {
            LineCounter lc = new LineCounter(i);
            executor.execute(lc);
        }
        executor.shutdown();
        System.out.println("Tempo de execucao(millis):" + (time = time - System.currentTimeMillis())*-1);
        pressToUnpause();
    }

    public void exercicio3() {  
        long time;
        LineCounter[] lineCounterSequencial = new LineCounter[4];
        time = System.currentTimeMillis();
        for (int i = 1; i < 4; i++) {
            
            lineCounterSequencial[i] = new LineCounter(i);
            lineCounterSequencial[i].lineCounterSemThreads();
        }
        System.out.println("Tempo de execucao(millis):" + (time = time - System.currentTimeMillis())*-1);
        pressToUnpause();
    }

    public void pressToUnpause() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner b = new Scanner(System.in);
        String buffer;
        System.out.println("Digite qualquer coisa para despausar!");
        buffer = b.nextLine();// ajudando a nao dar erro de buffer
    }
}
