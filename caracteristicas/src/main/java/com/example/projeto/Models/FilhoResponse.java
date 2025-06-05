package com.example.projeto.Models;

public class FilhoResponse {
    private String corCabelo;
    private String tipoCabelo;
    private String corOlho;
    private String corPele;
    private double altura;

    // ✅ Construtor com todos os atributos
    public FilhoResponse(String corCabelo, String tipoCabelo, String corOlho, String corPele, double altura) {
        this.corCabelo = corCabelo;
        this.tipoCabelo = tipoCabelo;
        this.corOlho = corOlho;
        this.corPele = corPele;
        this.altura = altura;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getTipoCabelo() {
        return tipoCabelo;
    }

    public void setTipoCabelo(String tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
