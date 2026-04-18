package OrientadoObjetos.Exercicios.EX003;

import OrientadoObjetos.Exercicios.EX003.IdadePessoa;

public class Main {
    public static void main(String[] args) {
        IdadePessoa p1 = new IdadePessoa();

        p1.setIdadePessoa(17);
        p1.setNomePessoa("Vinicius Augustin");

        System.out.println("Nome: " +  p1.getNomePessoa());
        System.out.println("Idade: " +  p1.getIdadePessoa());
        p1.verificaMaioridade();
    }
}
