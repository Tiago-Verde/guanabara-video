package com.tiagoverde;

public abstract class  Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int nivel;
    protected int experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nivel = 0;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    protected void ganharExperiencia() {
        this.experiencia = this.experiencia + 10;
    }


    protected void subirNivel() {
        if (getExperiencia() >= 100) {
            this.nivel ++;

        }
    }


}

