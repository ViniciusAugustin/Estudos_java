package OrientadoObjetos.Exercicios.EX002;

import OrientadoObjetos.Exercicios.EX002.ContaBanco;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();

        conta.setSaldo(1189.94);
        conta.setTitular("Vinicius Augustin");
        conta.setNumeroCota(67856);

        conta.mostraDados();
    }
}
