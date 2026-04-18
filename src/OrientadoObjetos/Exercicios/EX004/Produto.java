package OrientadoObjetos.Exercicios.EX004;

import java.util.Scanner;

public class Produto {
    //********************
    //     Variaveis
    //********************

    private String nome;
    private double preco;

    //********************
    //     Get e Set
    //********************

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    //********************
    //      Metodos
    //********************

    public void aplicarDesonto(){
        Scanner entrada = new Scanner(System.in);
        double valorDesonto;

        System.out.printf("Qual o percentual do desconto: ");
        int desconto = entrada.nextInt();


        valorDesonto = preco - ((preco * desconto) / 100);

        System.out.println("Desconto: " + valorDesonto);
    }
}
