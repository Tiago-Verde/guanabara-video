package com.tiagoverde;

public class Usuario extends Pessoa {
    private String login;
    private int totalAssistido;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }



    public void viuMaisUm(){
        this.setTotalAssistido(this.getTotalAssistido()+1);
        }


}
