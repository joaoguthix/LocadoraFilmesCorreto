package locadorafilmes;
import java.util.*;

public class Menu {
    public void exibirMenu (){
        try (Scanner scan = new Scanner(System.in)) {

            // para o filme de Comedia
            System.out.println("Digite um filme de comedia para ser adicionado: ");
            String film_comedy = scan.nextLine();
            System.out.println("Digite a duracao desse filme, em minutos: ");
            int duration_comedy = scan.nextInt();
            scan.nextLine();    //recebe o Enter do usuário

            // para o filme de Ação
            System.out.println("Digite um filme de comedia para ser adicionado: ");
            String film_action = scan.nextLine();
            System.out.println("Digite a duracao desse filme, em minutos: ");
            int duration_action = scan.nextInt();
            scan.nextLine();

            // criação dos objetos com base na entreda do usuário
            FilmeComedia comedia = new FilmeComedia(film_comedy, duration_comedy, false);
            FilmeAcao acao = new FilmeAcao(film_action, duration_action, false);
            ColecaoFilme colecao = new ColecaoFilme();

            // chamada dos métodos declarados em outras classes
            colecao.addFilme (comedia);
            colecao.addFilme(acao);
            colecao.alugar();
            comedia.playFilme();
            acao.playFilme();
        }
    }
}

//Está Classe Menu implementa o método exibirMenu() que recebera os valores de FilmeComedia, FilmeAcao e colecaoFilmes
//através da instância do Scanner. Após receber os dados o código cria objetos das classes "FilmeComedia", "FilmeAcao", "colecaoFilmes",
//usando os valore fornecidos pelo usuario. em seguida chama os métodos "addFilme"(), alugar(), playFilme(), para realizar ações relacionadas aos filmes.
