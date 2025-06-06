package com.example.projeto.Controllers;

import com.example.projeto.Models.Cabelo;
import com.example.projeto.Models.Olho;
import com.example.projeto.Models.Pele;
import com.example.projeto.Models.CaracteristicasRequest;
import com.example.projeto.Models.FilhoResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CaracteristicasController {

    @PostMapping("/calcular")
    public String calcularFilho(CaracteristicasRequest request, Model model) {
        Cabelo.Caracteristicas cabeloPai = new Cabelo.Caracteristicas(
                Cabelo.Cor.valueOf(request.getCorCabeloPai()),
                Cabelo.Tipo.valueOf(request.getTipoCabeloPai())
        );

        Cabelo.Caracteristicas cabeloMae = new Cabelo.Caracteristicas(
                Cabelo.Cor.valueOf(request.getCorCabeloMae()),
                Cabelo.Tipo.valueOf(request.getTipoCabeloMae())
        );

        Cabelo.Caracteristicas cabeloFilho = Cabelo.Caracteristicas.combinar(cabeloPai, cabeloMae);

        Olho.Cor olhoFilho = Olho.Cor.combinar(
                Olho.Cor.valueOf(request.getCorOlhoPai()),
                Olho.Cor.valueOf(request.getCorOlhoMae())
        );

        Pele.Cor peleFilho = Pele.Cor.combinar(
                Pele.Cor.valueOf(request.getCorPelePai()),
                Pele.Cor.valueOf(request.getCorPeleMae())
        );

        double alturaFilho = (request.getAlturaPai() + request.getAlturaMae()) / 2;

        FilhoResponse resultado = new FilhoResponse(
                cabeloFilho.getCor().toString(),
                cabeloFilho.getTipo().toString(),
                olhoFilho.toString(),
                peleFilho.toString(),
                alturaFilho
        );

        model.addAttribute("resultado", resultado);

        return "index";
    }
}
