
class Cabelo {

    public static enum Cor {
        ESCURO(3),
        LOIRO(2),
        RUIVO(1);

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

    public static enum Tipo {
        CRESPO(4),
        CACHEADO(3),
        ONDULADO(2),
        LISO(1);

        private int pesoTipo;

        Tipo(int pesoTipo) {
            this.pesoTipo = pesoTipo;
        }

        public int getPesoTipo() {
            return pesoTipo;
        }

        public static Tipo combinar(Tipo tipo1, Tipo tipo2) {
            return tipo1.getPesoTipo() >= tipo2.getPesoTipo() ? tipo1 : tipo2;
        }
    }

    public static class Caracteristicas {
        private Cor cor;
        private Tipo tipo;

        public Caracteristicas(Cor cor, Tipo tipo) {
            this.cor = cor;
            this.tipo = tipo;
        }

        public static Caracteristicas combinar(Caracteristicas cabelo1, Caracteristicas cabelo2) {
            Cor corFinal = Cor.combinar(cabelo1.cor, cabelo2.cor);
            Tipo tipoFinal = Tipo.combinar(cabelo1.tipo, cabelo2.tipo);
            return new Caracteristicas(corFinal, tipoFinal);
        }

        @Override
        public String toString() {
            return cor + " + " + tipo;
        }
    }
}

class Olho {

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


class Pele {
    public enum Cor {
        ESCURA(3),
        PARDA(2),
        CLARA(1);

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
