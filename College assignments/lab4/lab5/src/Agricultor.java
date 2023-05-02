public class Agricultor implements Observadores{
    @Override
    public void onAlteracao(PrevisaoTempo pt){
        if(pt.getTemperatura() < 0){
            System.out.println("Agricultores ligaram o aquecedor para lidar com o frio");
        }
        if(pt.getChuva()>80 && pt.getUmidade() > 60){
            System.out.println("Agricultores nao ligaram os regadores por causa da grande chance de chuva e umidade no ar, economizando assim agua e dinheiro ");
        }
    }
}
