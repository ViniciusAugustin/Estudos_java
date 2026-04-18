package OrientadoObjetos.Aulas.Modelo;

public class Serie extends Titulo{
    //********************
    //     Variaveis
    //********************

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    //********************
    //     Get e Set
    //********************

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
    public int  getTemporadas() {
        return temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public boolean getAtiva() {
        return ativa;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //********************
    //      Metodos
    //********************
}
