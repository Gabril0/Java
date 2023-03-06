public abstract class Atleta implements Comparable<Atleta> {
    private String nome;
    private int idade;
    private float peso, altura;
    
    Atleta(){}
    Atleta(String nome, int idade,float peso, float altura){
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }
    protected void aquecer(int minutos){
        System.out.println("O jogardor " + nome + " aqueceu por cerca de "  
        + minutos + " minutos" + "\n" +
        "Este jogador tem " + peso + " Kg" + " e altura de "+ altura + " metros"
        + " e tem " + idade + " anos!");
    }
    protected abstract void jogar();


    //getters and setters
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public float getPeso() {
        return peso;
    }
    
    @Override
    public String toString(){
        return "Nome do jogador: " + nome + "\n" +
        "Peso: " + peso + "\n" +
        "Idade: " + idade + "\n" +
        "Altura: " + altura + "\n";
    }

    @Override
    public int compareTo(Atleta o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}

