package br.com.audiokeep.gerfy.models.modelos;

public class Audio {
    private String Titulo;
    private String duracao;
    private int TotaldeReproducoes;
    private int curtidas;
    private int Classificacoes;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getTotaldeReproducoes() {
        return TotaldeReproducoes;
    }

    public void setTotaldeReproducoes(int totaldeReproducoes) {
        TotaldeReproducoes = totaldeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacoes() {
        return Classificacoes;
    }

    public void setClassificacoes(int classificacoes) {
        Classificacoes = classificacoes;
    }
    public void sendCurtir (int Curtir){
            this.curtidas++;

    }
    public void reproduzirPlayer (){
        System.out.println("Reproduzindo faixas.");
        this.TotaldeReproducoes++;
    }

}
