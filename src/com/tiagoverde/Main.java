package com.tiagoverde;

public class Main {

    public static void main(String[] args) {

        Video gato = new Video("Gato fofinho");
        Usuario us = new Usuario("Tiago", 36, "M");
        Video cachorro = new Video("Cachorro Louco");

        Visualizacao vis[] = new Visualizacao[11];
        vis[0] = new Visualizacao(us, gato);
        vis[1] = new Visualizacao(us, cachorro);
        vis[2] = new Visualizacao(us, gato);
        vis[3] = new Visualizacao(us, gato);
        vis[4] = new Visualizacao(us, gato);
        vis[5] = new Visualizacao(us, gato);
        vis[6] = new Visualizacao(us, gato);
        vis[7] = new Visualizacao(us, gato);
        vis[8] = new Visualizacao(us, gato);
        vis[9] = new Visualizacao(us, cachorro);
        vis[10] = new Visualizacao(us, gato);

        vis[0].review("Pessimo filme");



        us.subirNivel();

        System.out.println("Total assistido " + us.getTotalAssistido());
        System.out.println("Experiencia "+ us.getExperiencia());
        System.out.println("gato " + gato.getViews());
        System.out.println("cachorro " + cachorro.getViews());

        System.out.println("Nivel " + us.getNivel());






    }
}
