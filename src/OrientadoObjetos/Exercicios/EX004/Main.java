package OrientadoObjetos.Exercicios.EX004;

import OrientadoObjetos.Exercicios.EX004.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setPreco(30);
        produto.setNome("Kinder-ovo");

        produto.aplicarDesonto();
    }
}
