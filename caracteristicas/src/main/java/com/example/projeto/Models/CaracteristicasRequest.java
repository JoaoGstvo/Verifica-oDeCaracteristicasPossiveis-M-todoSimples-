// Pacote onde tá o arquivo
package com.example.projeto.Models;

// Classe que representa os dados enviados pelo formulário
public class CaracteristicasRequest {

    // Campos do formulário do pai
    public String corCabeloPai;
    public String tipoCabeloPai;
    public String corOlhoPai;
    public String corPelePai;
    public double alturaPai;

    // Campos do formulário da mãe
    public String corCabeloMae;
    public String tipoCabeloMae;
    public String corOlhoMae;
    public String corPeleMae;
    public double alturaMae;

    // Pai
    public String getCorCabeloPai() {
        return corCabeloPai;
    }

    public void setCorCabeloPai(String corCabeloPai) {
        this.corCabeloPai = corCabeloPai;
    }

    public String getTipoCabeloPai() {
        return tipoCabeloPai;
    }

    public void setTipoCabeloPai(String tipoCabeloPai) {
        this.tipoCabeloPai = tipoCabeloPai;
    }

    public String getCorOlhoPai() {
        return corOlhoPai;
    }

    public void setCorOlhoPai(String corOlhoPai) {
        this.corOlhoPai = corOlhoPai;
    }

    public String getCorPelePai() {
        return corPelePai;
    }

    public void setCorPelePai(String corPelePai) {
        this.corPelePai = corPelePai;
    }

    public double getAlturaPai() {
        return alturaPai;
    }

    public void setAlturaPai(double alturaPai) {
        this.alturaPai = alturaPai;
    }

    // Mãe
    public String getCorCabeloMae() {
        return corCabeloMae;
    }

    public void setCorCabeloMae(String corCabeloMae) {
        this.corCabeloMae = corCabeloMae;
    }

    public String getTipoCabeloMae() {
        return tipoCabeloMae;
    }

    public void setTipoCabeloMae(String tipoCabeloMae) {
        this.tipoCabeloMae = tipoCabeloMae;
    }

    public String getCorOlhoMae() {
        return corOlhoMae;
    }

    public void setCorOlhoMae(String corOlhoMae) {
        this.corOlhoMae = corOlhoMae;
    }

    public String getCorPeleMae() {
        return corPeleMae;
    }

    public void setCorPeleMae(String corPeleMae) {
        this.corPeleMae = corPeleMae;
    }

    public double getAlturaMae() {
        return alturaMae;
    }

    public void setAlturaMae(double alturaMae) {
        this.alturaMae = alturaMae;
    }
}
