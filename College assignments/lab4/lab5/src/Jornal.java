public class Jornal implements Observadores {
    @Override
    public void onAlteracao(PrevisaoTempo pt){
        if(pt.getTemperatura() > 40 || pt.getTemperatura() < -10){
            System.out.println("Noticia do jornal!!! Temperaturas extremas, tomem cuidado!");
        }
        if(pt.getChuva() > 50){
            System.out.println("Noticia do jornal!!! Grandes chances de chuvas! Com ventos chegando ate " + pt.getVelocidadeVento());
        }
        if(pt.getUmidade() < 50){
            System.out.println("Noticia do jornal!!! Tempo seco, utilize umidificadores de ar para evitar problemas de respiracao");
        }
    }
}
