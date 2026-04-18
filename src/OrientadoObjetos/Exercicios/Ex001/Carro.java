package OrientadoObjetos.Exercicios.Ex001;

public class Carro {
    String modelo;
    int anoFabricacao;
    String cor;

    void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("AnoFabricacao: " + anoFabricacao);
        System.out.println("Cor: " + cor);
    }

    int anos(){
        return 2026 - anoFabricacao;
    }
}
