package org.example;

public class FechamentoTemporadaPartida implements Partida {

    private Temporada temporada;

    public FechamentoTemporadaPartida(Temporada temporada) {
        this.temporada = temporada;
    }

    public void executar() {
        this.temporada.fecharTemporada();
    }

    public void cancelar() {
        this.temporada.abrirTemporada();
    }
}