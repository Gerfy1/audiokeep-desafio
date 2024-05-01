package br.com.audiokeep.gerfy.models.modelos;

public class Preferidos extends Audio{
    public void inclui(Audio audio){
        if (audio.getClassificacoes() >= 9){
            System.out.println(audio.getTitulo() + " é um sucesso absoulto e " + " preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos mais curtidos!");
        }
    }
}
