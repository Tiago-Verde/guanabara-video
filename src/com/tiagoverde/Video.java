package com.tiagoverde;

public class Video implements acoesVideo{
    private String titulo;
    private String avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;


    public Video(String titulo) {
        this.titulo = titulo;
        this.views =0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }



    @Override
    public void play() {
        this.getTitulo();
        this.setViews(this.getViews()+1);
        this.setReproduzindo(true);
        System.out.println("O video " +this.getTitulo()+ " está sendo reproduzido");
    }



    @Override
    public void pause() {
        this.getTitulo();
        if (this.isReproduzindo()){
            this.setReproduzindo(false);
            System.out.println("O video " +this.getTitulo()+ " esta em pausa");
        }

    }

    @Override
    public void like() {
        this.getTitulo();
        this.setCurtidas(this.getCurtidas()+1);
    }

    public void Status(){
        System.out.println("Titulo: " +this.getTitulo());
        System.out.println("Curtidas: " +this.getCurtidas());
        System.out.println("Views: " +this.getViews());
    }
}
