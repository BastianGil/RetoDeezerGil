package com.example.marenjifo.retodeezerg;

public class Lista {

    private String nomlist;
    private String usu;
    private String cancn;

    public Lista(String nomlist, String usu, String cancn) {
        this.nomlist = nomlist;
        this.usu = usu;
        this.cancn = cancn;
    }

    public String getnomlist() {
        return nomlist;
    }

    public void setnomlist(String nomlist) {
        this.nomlist = nomlist;
    }

    public String getusu() { return usu;}

    public void setusu(String usu) { this.usu = usu; }

    public String getCancn() { return cancn; }

    public void setCancn(String cancn) { this.cancn = cancn; }
}
