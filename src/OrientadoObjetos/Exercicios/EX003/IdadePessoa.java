package OrientadoObjetos.Exercicios.EX003;

import java.security.PublicKey;

public class IdadePessoa {
    //********************
    //     Variaveis         (Sempre private)
    //********************

    private int idadePessoa;
    private String nomePessoa;

    //********************
    //     Get e Set
    //********************

    public String getNomePessoa() {
        return nomePessoa;
    }
    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    //********************
    //      Funções
    //********************

    void verificaMaioridade(){
        if(idadePessoa >= 18){
            System.out.println("A pessoa é maior de idade!");
        }else{
            System.out.println("A pessoa é menor de idade!");
        }
    }

}
