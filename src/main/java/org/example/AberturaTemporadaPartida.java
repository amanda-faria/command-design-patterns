package org.example;


public class AberturaTemporadaPartida implements Partida {

    private Temporada temporada;

    public AberturaTemporadaPartida(Temporada temporada) {
        this.temporada = temporada;
    }

    public void executar() {
        this.temporada.abrirTemporada();
    }

    public void cancelar() {
        this.temporada.fecharTemporada();
    }
}