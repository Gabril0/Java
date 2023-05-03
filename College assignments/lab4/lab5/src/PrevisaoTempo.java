import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PrevisaoTempo implements Observavel {
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    private float temperatura, umidade, chuva, velocidadeVento;

    ArrayList<Observadores> observadores = new ArrayList<Observadores>();

    @Override
    public void update() {
        try {
            System.out.println("\nColetando dados...");
            Thread.sleep(5000);
            temperatura = -20 + r.nextInt(70); // coloquei para ir de -20ºC ate 50 ºC
            umidade = r.nextInt(100);
            chuva = r.nextInt(100); // todos com 100 estao relacionados a porcentagem
            velocidadeVento = r.nextInt(300); // chutei um valor de velocidade maxima
        } catch (Exception e) {
            System.out.println("Nao foi possivel fazer a previsao do tempo");
        }
    }

    public void fazPrevisao() {

        while (true) {

            update();
            System.out.println("Dados: Temperatura: " + temperatura + "\n"
            + "Umidade: " + umidade + "\n"
            + "Chuva: " + chuva + "\n"
            + "Velocidade do vento: " + velocidadeVento + "\n");

            for (Observadores ob : observadores) {
                ob.onAlteracao(this);

            }
        }
    }

    public void removerObservador(Observadores ob) {
        observadores.remove(ob);
    }

    public void adicionarObservador(Observadores ob) {
        observadores.add(ob);

    }

    public void verObservadoresAtivos() {
        for (Observadores printList : observadores) {
            System.out.println(printList.toString()); 

        }
    }

    public float getChuva() {
        return chuva;
    }
    public float getTemperatura() {
        return temperatura;
    }
    public float getUmidade() {
        return umidade;
    }

    public float getVelocidadeVento() {
        return velocidadeVento;
    }
}
