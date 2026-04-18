package OrientadoObjetos.Exercicios.Ex001;

public class Murica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("O nome da musica é " + titulo);
        System.out.println("O Artista é " + artista);
        System.out.println("O ano de lançamento foi " + anoLancamento);
        System.out.println("O avaliacao foi " + avaliacao);
        System.out.println("O numero da avaliacao foi " + numAvaliacoes);
    }

    void avaliacoes(double nota){
        numAvaliacoes++;
        avaliacao += nota;
    }

    double media() {
        return avaliacao / numAvaliacoes;
    }
}
