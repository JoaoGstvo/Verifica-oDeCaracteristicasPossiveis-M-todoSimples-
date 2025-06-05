package com.example.projeto.Models;

public class Olho {

    public enum Cor {
        CASTANHO(3),
        VERDE(2),
        AZUL(1);

        private int pesoCor;

        Cor(int pesoCor) {
            this.pesoCor = pesoCor;
        }

        public int getPesoCor() {
            return pesoCor;
        }

        public static Cor combinar(Cor cor1, Cor cor2) {
            return cor1.getPesoCor() >= cor2.getPesoCor() ? cor1 : cor2;
        }
    }
}
