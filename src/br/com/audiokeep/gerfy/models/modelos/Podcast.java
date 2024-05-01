package br.com.audiokeep.gerfy.models.modelos;

public class Podcast extends Audio {
        private int temporadaPodcast;
        private int episodiosPodcast;
        private boolean ativo;
        private int mintutosEpPodcast;
        private String Titulo;
        private String descricao;

    public int getTemporadaPodcast() {
        return temporadaPodcast;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTemporadaPodcast(int temporadaPodcast) {
        this.temporadaPodcast = temporadaPodcast;
    }

    public int getEpisodiosPodcast() {
        return episodiosPodcast;
    }

    public void setEpisodiosPodcast(int episodiosPodcast) {
        this.episodiosPodcast = episodiosPodcast;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getMintutosEpPodcast() {
        return mintutosEpPodcast;
    }

    public void setMintutosEpPodcast(int mintutosEpPodcast) {
        this.mintutosEpPodcast = mintutosEpPodcast;
    }

    @Override
    public int getClassificacoes() {
        if (getCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }

}
