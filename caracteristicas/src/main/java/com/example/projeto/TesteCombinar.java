package com.example.projeto;

import com.example.projeto.Models.Cabelo;
import com.example.projeto.Models.Olho;
import com.example.projeto.Models.Pele;
import com.example.projeto.Models.FilhoResponse;

public class TesteCombinar {

    public static void main(String[] args) {
        // Criando características do Pai
        Cabelo.Caracteristicas cabeloPai = new Cabelo.Caracteristicas(
                Cabelo.Cor.ESCURO,
                Cabelo.Tipo.LISO
        );

        // Criando características da Mãe
        Cabelo.Caracteristicas cabeloMae = new Cabelo.Caracteristicas(
                Cabelo.Cor.LOIRO,
                Cabelo.Tipo.CACHEADO
        );

        // Combinando cabelo
        Cabelo.Caracteristicas cabeloFilho = Cabelo.Caracteristicas.combinar(cabeloPai, cabeloMae);

        // Combinando olhos
        Olho.Cor olhoFilho = Olho.Cor.combinar(
                Olho.Cor.AZUL,
                Olho.Cor.VERDE
        );

        // Combinando pele
        Pele.Cor peleFilho = Pele.Cor.combinar(
                Pele.Cor.CLARA,
                Pele.Cor.PARDA
        );

        // Calculando altura
        double alturaFilho = (1.80 + 1.60) / 2;

        // Criando resposta
        FilhoResponse resultado = new FilhoResponse(
        cabeloFilho.getCor().toString(),
        cabeloFilho.getTipo().toString(),
        olhoFilho.toString(),
        peleFilho.toString(),
        alturaFilho
        );

        // Imprimindo o resultado
        System.out.println("Cabelo: " + resultado.getCorCabelo());
        System.out.println("Tipo: " + resultado.getTipoCabelo());
        System.out.println("Olho: " + resultado.getCorOlho());
        System.out.println("Pele: " + resultado.getCorPele());
        System.out.println("Altura: " + resultado.getAltura());
    }
}
