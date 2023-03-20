public class Honda implements Marcas{
    private String nome = "Honda";

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public Carro geraCarro(String nomeCarro) {

        if (nomeCarro.compareTo("H1") == 0) return new CarroHonda1();
        if (nomeCarro.compareTo("H2") == 0) return new CarroHonda2();
        else return null;
    }
}
