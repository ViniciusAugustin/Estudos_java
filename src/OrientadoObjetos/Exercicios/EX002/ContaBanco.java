package OrientadoObjetos.Exercicios.EX002;

public class ContaBanco {
    //********************
    //     Variaveis         (Sempre private)
    //********************

    private int numeroCota;
    private double saldo;
    private String titular;

    //********************
    //     Get e Set
    //********************

    public int getNumeroCota() {
        return numeroCota;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }

    public void setNumeroCota(int numeroCota) {
        this.numeroCota = numeroCota;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }


    //********************
    //      Funções
    //********************

    public void mostraDados(){
        System.out.println("Dados do Conta banco:");
        System.out.println("Numero da Conta: " + numeroCota);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Titular: " + titular);
    }
}
