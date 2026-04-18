package OrientadoObjetos.Aulas.Modelo;

public class Titulo {
    //********************
    //     Variaveis
    //********************

    private String titulo;
    private int anoLancamento;
    private boolean icluidoPlano;
    private double somaAvalacoes;
    private int totalDeAvaliacao;
    private int duracaoMinutos;

    //********************
    //     Get e Set
    //********************

    public String getTitulo() {
        return titulo;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public boolean getIcluidoPlano() {
        return icluidoPlano;
    }
    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }
    public int getDuracaoMinutos(){
        return duracaoMinutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public void setIcluidoPlano(boolean icluidoPlano) {
        this.icluidoPlano = icluidoPlano;
    }
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    //********************
    //      Metodos
    //********************

    public void exibeFixaTecnica(){
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração do filme: " + duracaoMinutos);
        System.out.println("Avaliação: " + somaAvalacoes);
        System.out.println("Esta incluso no plano: " + icluidoPlano);
        System.out.println("Total de avaliações nesse filme: " + totalDeAvaliacao);
    }
    public void avalia(double nota){
        totalDeAvaliacao ++;

        somaAvalacoes += nota;
    }
    public double pegaMedia(){
        return somaAvalacoes / totalDeAvaliacao;
    }
}
