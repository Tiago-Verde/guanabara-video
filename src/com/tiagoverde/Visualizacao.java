package com.tiagoverde;

public class Visualizacao {
    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido()+1);
        this.espectador.ganharExperiencia();
        this.filme.setViews(this.filme.getViews()+1);
    }


    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }



    public void review (String avaliacao){
        filme.setReview(avaliacao);
    }


    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);

    }


    public void avalir (float porc){
        if(porc<10){
            this.filme.setAvaliacao(1);
        }else if(porc == 100){
                this.filme.setAvaliacao(10);
        }else{
                this.filme.setAvaliacao(5);
       }
    }
}





