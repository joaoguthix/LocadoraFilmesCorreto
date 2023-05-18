package locadorafilmes;

// Classe abstrata Filme, que servirá como "pai" para outras classes e não poderá ser instanciada
abstract class Filme {
    // atributos da classe pai
    private String nome;
    private int duration;
    private boolean alugado;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public boolean Alugado() {
        return alugado;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    // construtor da classe pai
    public Filme(String nome, int duration, boolean alugado) {
        this.nome = nome;
        this.duration = duration;
        this.alugado = alugado;
    }
    // método da classe pai
    public abstract void playFilme();
}
//Está é uma Classe abstrata que serve como uma classe "Pai" para outras classes relacionadas
//a filmes. Possui um único método chamado playFilmes que deve se implemetado nas Classes "Filhas"
//também foi implementado os métodos getter e setter para cada atributo permitindo obter e definir
//seus valores. ta descrito nó código o que cada coisa faz...

