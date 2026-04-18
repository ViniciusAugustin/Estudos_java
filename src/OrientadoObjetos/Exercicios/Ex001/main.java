package OrientadoObjetos.Exercicios.Ex001;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1
        Pessoa pessoa1 = new Pessoa();

        pessoa1.heloo();

        System.out.println("\n\n\n");


        // 2
        Calculadora cal = new Calculadora();

        System.out.printf("Digite o numero que quer saber o dobro: ");
        double numero = entrada.nextDouble();
        System.out.println(cal.dobro(numero));

        System.out.println("\n\n\n");


        //3
        Murica  music = new Murica();

        music.titulo = "sadsd";
        music.artista = "sdfsdf";
        music.anoLancamento = 2003;
        music.avaliacao = 8.3;
        music.numAvaliacoes = 8;

        music.fichaTecnica();

        music.avaliacoes(4.27);
        music.avaliacoes(5.87);
        music.avaliacoes(4);
        music.avaliacoes(9);
        music.avaliacoes(8.7);

        System.out.println(music.media());

        System.out.println("\n\n\n");


        //4
        Carro car = new Carro();

        car.modelo = "Virtus";
        car.anoFabricacao = 2023;
        car.cor = "Prata";

        car.fichaTecnica();

        System.out.println("O carro tem " + car.anos() + " anos");
    }
}
