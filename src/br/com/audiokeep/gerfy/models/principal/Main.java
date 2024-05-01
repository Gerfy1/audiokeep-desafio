package br.com.audiokeep.gerfy.models.principal;

import br.com.audiokeep.gerfy.models.modelos.Audio;
import br.com.audiokeep.gerfy.models.modelos.Musicas;
import br.com.audiokeep.gerfy.models.modelos.Podcast;
import br.com.audiokeep.gerfy.models.modelos.Preferidos;

public class Main{
    public static void main(String[] args) {

        Audio faixa1 = new Audio();

        faixa1.setTitulo("Hope is a danger");
        faixa1.setCurtidas(1000);
        faixa1.setDuracao("4:00");
        faixa1.setClassificacoes(400);
        faixa1.setTotaldeReproducoes(600);
        faixa1.sendCurtir(1);

        Podcast host1 = new Podcast();
        host1.setTitulo("Aprendendo frameWork!");
        host1.setAtivo(true);
        host1.setEpisodiosPodcast(8);
        host1.setTemporadaPodcast(2);
        host1.setDescricao("Podcast voltado ao framework React");
        host1.setTotaldeReproducoes(600);
        host1.setCurtidas(20);
        host1.setDuracao("50:00");
        host1.reproduzirPlayer();


        Musicas musica1 = new Musicas();
        musica1.setTitulo("Happy Kopwear");
        musica1.setAlbum("Happy Kopwear:2020");
        musica1.setArtista("Rob Takara");
        musica1.setGenero("Pop");
        musica1.setCurtidas(1024);
        musica1.setDuracao("3:20");
        musica1.setClassificacoes(1456);

        musica1.getTitulo();
        musica1.getAlbum();
        musica1.getArtista();


        Preferidos pref1 = new Preferidos();
        pref1.inclui(host1);
        pref1.inclui(faixa1);



    }
}