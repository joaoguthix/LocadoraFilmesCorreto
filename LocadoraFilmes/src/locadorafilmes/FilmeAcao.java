package locadorafilmes;

// classe concreta FilmeAcao que herda da classe abstrata Filme
class FilmeAcao extends Filme {
    public FilmeAcao(String nome, int duration, boolean alugado) {
        super(nome, duration, alugado);       //"super" serve para construir a classe pai com os parametros do filho
    }

    @Override       //sobrescreve o método da classe pai
    public void playFilme() {
        System.out.println("\nO filme " + getNome() + " está rodando. Faltam ainda " + getDuration() + " minutos.");
    }
}

//está é uma classe concreta que herda da classe abstrata "filme"
//ela define uma implementação especifica para filmes de ação
//também sobescreve o método playFilme() que foi herdado de Filme
//esta classe deve ser removida e passada como um atributo dentro da Classe "Pai" Filme. o mesmo irá acontecer
//para a Classe "Filha" FilmeComedia