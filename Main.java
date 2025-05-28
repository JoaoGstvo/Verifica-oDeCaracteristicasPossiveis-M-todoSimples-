import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner criado
        Scanner scanner = new Scanner(System.in);
        
        //Cor do Cabelo do Pai
        System.out.print("Digite a cor do cabelo do pai (ESCURO, LOIRO, RUIVO): ");

        String corCabeloPaiStr = scanner.nextLine().toUpperCase();

        if (!corCabeloPaiStr.matches("ESCURO|LOIRO|RUIVO")) {
            System.out.println("Cor de cabelo inválida. Tente novamente.");
            return;
        }
        else if (corCabeloPaiStr.isEmpty()) {
            System.out.println("Cor de cabelo não pode ser vazia. Tente novamente.");
            return;
        }

        Cabelo.Cor corCabeloPai = Cabelo.Cor.valueOf(corCabeloPaiStr);


        //Tipo do Cabelo do Pai
        System.out.print("Digite o tipo do cabelo do pai (CRESPO, CACHEADO, ONDULADO, LISO): ");

        String tipoCabeloPaiStr = scanner.nextLine().toUpperCase();

        if (!tipoCabeloPaiStr.matches("CRESPO|CACHEADO|ONDULADO|LISO")) {
            System.out.println("Tipo de cabelo inválido. Tente novamente.");
            return;
        }
        else if (tipoCabeloPaiStr.isEmpty()) {
            System.out.println("Tipo de cabelo não pode ser vazio. Tente novamente.");
            return;
        }

        Cabelo.Tipo tipoCabeloPai = Cabelo.Tipo.valueOf(tipoCabeloPaiStr);

        Cabelo.Caracteristicas cabeloDoPai = new Cabelo.Caracteristicas(corCabeloPai, tipoCabeloPai);


        //Cor do cabelo da mãe
        System.out.print("Digite a cor do cabelo da mãe (ESCURO, LOIRO, RUIVO): ");

        String corCabeloMaeStr = scanner.nextLine().toUpperCase();

        if (!corCabeloMaeStr.matches("ESCURO|LOIRO|RUIVO")) {
            System.out.println("Cor de cabelo inválida. Tente novamente.");
            return;
        }
        else if (corCabeloMaeStr.isEmpty()) {
            System.out.println("Cor de cabelo não pode ser vazia. Tente novamente.");
            return;
        }

        Cabelo.Cor corCabeloMae = Cabelo.Cor.valueOf(corCabeloMaeStr);


        //Tipo do cabelo da mãe
        System.out.print("Digite o tipo do cabelo da mãe (CRESPO, CACHEADO, ONDULADO, LISO): ");

        String tipoCabeloMaeStr = scanner.nextLine().toUpperCase();

        if (!tipoCabeloMaeStr.matches("CRESPO|CACHEADO|ONDULADO|LISO")) {
            System.out.println("Tipo de cabelo inválido. Tente novamente.");
            return;
        }
        else if (tipoCabeloMaeStr.isEmpty()) {
            System.out.println("Tipo de cabelo não pode ser vazio. Tente novamente.");
            return;
        }

        Cabelo.Tipo tipoCabeloMae = Cabelo.Tipo.valueOf(tipoCabeloMaeStr);


        //Combinação das características do cabelo
        Cabelo.Caracteristicas cabeloDaMae = new Cabelo.Caracteristicas(corCabeloMae, tipoCabeloMae);

        Cabelo.Caracteristicas cabeloDoFilho = Cabelo.Caracteristicas.combinar(cabeloDoPai, cabeloDaMae);
        System.out.println();


        //Cor dos olhos do Pai
        System.out.print("Digite a cor dos olhos do pai (CASTANHO, VERDE, AZUL): ");
        String corOlhoPaiStr = scanner.nextLine().toUpperCase();

        if (!corOlhoPaiStr.matches("CASTANHO|VERDE|AZUL")) {
            System.out.println("Cor de olhos inválida. Tente novamente.");
            return;
        }
        else if (corOlhoPaiStr.isEmpty()) {
            System.out.println("Cor de olhos não pode ser vazia. Tente novamente.");
            return;
        }

        //Cor dos olhos da mãe
        System.out.print("Digite a cor dos olhos da mãe (CASTANHO, VERDE, AZUL): ");

        String corOlhoMaeStr = scanner.nextLine().toUpperCase();
        if (!corOlhoMaeStr.matches("CASTANHO|VERDE|AZUL")) {
            System.out.println("Cor de olhos inválida. Tente novamente.");
            return;
        }
        else if (corOlhoMaeStr.isEmpty()) {
            System.out.println("Cor de olhos não pode ser vazia. Tente novamente.");
            return;
        }


        System.out.println();

        //Combinação das cores dos olhos
        Olho.Cor olhosDoPai = Olho.Cor.valueOf(corOlhoPaiStr);
        Olho.Cor olhosDaMae = Olho.Cor.valueOf(corOlhoMaeStr);

        Olho.Cor olhosDoFilho = Olho.Cor.combinar(olhosDoPai, olhosDaMae);


        //Cor da pele do Pai
        System.out.print("Digite a cor da pele do pai (CLARA, PARDA, NEGRA): ");
        String corPelePaiStr = scanner.nextLine().toUpperCase();
        if (!corPelePaiStr.matches("CLARA|PARDA|NEGRA")) {
            System.out.println("Cor de pele inválida. Tente novamente.");
            return;
        }
        else if (corPelePaiStr.isEmpty()) {
            System.out.println("Cor de pele não pode ser vazia. Tente novamente.");
            return;
        }

        Pele.Cor peleDoPai = Pele.Cor.valueOf(corPelePaiStr);


        //Cor da pele da mãe
        System.out.print("Digite a cor da pele da mãe (CLARA, PARDA, NEGRA): ");
        String corPeleMaeStr = scanner.nextLine().toUpperCase();
        if (!corPeleMaeStr.matches("CLARA|PARDA|NEGRA")) {
            System.out.println("Cor de pele inválida. Tente novamente.");
            return;
        }
        else if (corPeleMaeStr.isEmpty()) {
            System.out.println("Cor de pele não pode ser vazia. Tente novamente.");
            return;
        }

        Pele.Cor peleDaMae = Pele.Cor.valueOf(corPeleMaeStr);
        System.out.println();

    

        Pele.Cor peleDoFilho = Pele.Cor.combinar(peleDoPai, peleDaMae);


        //Média da altura para o filho
        System.out.print("Digite a altura do pai: ");

        double alturaDoPai = scanner.nextDouble();

        if (alturaDoPai <= 0) {
            System.out.println("Altura inválida. Tente novamente.");
            return;
        }


        System.out.print("Digite a altura da mãe: ");
        
        double alturaDaMae = scanner.nextDouble();

        if (alturaDaMae <= 0) {
            System.out.println("Altura inválida. Tente novamente.");
            return;
        }
        
        System.out.println();

        double alturaDoFilho = (alturaDoPai + alturaDaMae) / 2;


        System.out.println("Características do filho:");
        System.out.println("Cor e Tipo do cabelo: " + cabeloDoFilho);
        System.out.println("Cor dos olhos: " + olhosDoFilho);
        System.out.println("Cor da pele: " + peleDoFilho);
        System.out.println("Altura: " + alturaDoFilho);

        scanner.close();

    }
}
