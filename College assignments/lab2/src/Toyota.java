public class Toyota implements Marcas{
    private String nome = "Toyota";
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public Carro geraCarro(String nomeCarro) {

        if (nomeCarro.compareTo("T1") == 0) return new CarroToyota1();
        if (nomeCarro.compareTo("T2") == 0) return new CarroToyota2();
        else return null;
    }
}

