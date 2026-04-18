package OrientadoObjetos.Aulas.Calculos;


import OrientadoObjetos.Aulas.Modelo.Titulo;


public class CalculadoraTermpo {
    //********************
    //     Variaveis
    //********************

    private int tempoTotal;

    //********************
    //     Get e Set
    //********************

    public int getTempoTotal() {
        return tempoTotal;
    }

    //********************
    //      Metodos
    //********************

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
