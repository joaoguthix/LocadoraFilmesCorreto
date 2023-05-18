package locadorafilmes;
import java.util.ArrayList;
import java.util.List;

// Classe concreta ColecaoFilme que implementa a interface Locadora
class ColecaoFilme implements Locadora {
    // criação de lista para armazenar os dados do tipo "Filme"
    private List<Filme> Filme = new ArrayList<>();

    // chama o método da classe
    public void addFilme (Filme filme) {        // função criada para adicionar na lista "Filme" o objeto do tipo Filme
        Filme.add(filme);
    }

    @Override       // sobrescreve o método da Interface Locadora
    public void alugar() {
        for (Filme filmes : Filme) {
            String status = filmes.Alugado() ? "foi alugado" : "não foi alugado";
            System.out.println(filmes.getNome() + status );
        }
    }
}

//Interface Locadora está com a nomenclatura errada o correto seria criar a Interface com um
//"I" no inicio do nome para diferenciar o que é uma classe de uma Interface deve atualizar o nome de Locadora para ILocadora
//A Classe ColecaoFilme está implementando a Interface Locadora e possui uma Lista chamada Filme para armazenar objetos do tipo filme
//A Classe possui 1 método "addFilme" que adiciona um objeto do tipo Filme á uma lista.
// também possui o método "alugar" que herda de Locadora e é sobescrito para que o método percorra a Lista de Filmes e devolva uma mensagem
//indicando os filmes que foram alugados ou não.