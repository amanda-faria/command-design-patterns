package org.example;


import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private List<Partida> partidas = new ArrayList<Partida>();

    public void executarPartida(Partida partida) {
        this.partidas.add(partida);
        partida.executar();
    }

    public void cancelarUltimaPartida() {
        if (partidas.size() != 0) {
            Partida partida = this.partidas.get(this.partidas.size() - 1);
            partida.cancelar();
            this.partidas.remove(this.partidas.size() - 1);
        }
    }

}