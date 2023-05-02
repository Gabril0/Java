public class Aeroporto implements Observadores{
    @Override
    public void onAlteracao(PrevisaoTempo pt){
        if(pt.getChuva() > 50 && pt.getVelocidadeVento() < 50){
            System.out.println("Voos não foram cancelados embora as grandes chances de chuva pois ventos estao bem fracos");
        }
        if(pt.getVelocidadeVento() > 50){
            System.out.println("Voos foram cancelados por conta de ventanias fortes na regiao");
        }
    }
}
