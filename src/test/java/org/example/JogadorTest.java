package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    Jogador jogador;
    Temporada temporada;

    @BeforeEach
    void setUp() {
        jogador = new Jogador();
        temporada = new Temporada (2018, 2);
    }

    @Test
    void deveAbrirTemporada() {
        Partida aberturaTemporada = new AberturaTemporadaPartida(temporada);
        jogador.executarPartida(aberturaTemporada);

        assertEquals("Temporada aberta", temporada.getSituacao());
    }

    @Test
    void deveFecharTemporada() {
        Partida fechamentoTemporada = new FechamentoTemporadaPartida(temporada);
        jogador.executarPartida(fechamentoTemporada);

        assertEquals("Temporada fechada", temporada.getSituacao());
    }

    @Test
    void deveCancelarFechamentoDaTemporada() {
        Partida aberturaTemporada = new AberturaTemporadaPartida(temporada);
        Partida fechamentoTemporada = new FechamentoTemporadaPartida(temporada);

        jogador.executarPartida(aberturaTemporada);
        jogador.executarPartida(fechamentoTemporada);

        jogador.cancelarUltimaPartida();

        assertEquals("Temporada aberta", temporada.getSituacao());
    }

}