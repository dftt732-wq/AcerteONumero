package AcerteONumero.test;

import Dominio.Espaco;
import Dominio.Pontuacao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int pontuacao = 0 ;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean jogar = true;

        System.out.println("voce tem 4 tentativas\nso escolha numeros de 0 a 10");

        while (jogar) {
            String[] contador = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};


            int escolhaCpu = random.nextInt(0, 11);

            for (int i = 0; i < 4; i++) {
                System.out.println("tentativa " + (i+1) + " de 4");

                int escolhaJogador = scanner.nextInt();


                if (escolhaJogador < 0 || escolhaJogador > 10) {
                    System.out.println("somente numeros de 0 a 10");
                    continue;
                }

                if (escolhaJogador == escolhaCpu) {
                    System.out.println("voce ganhou");
                    pontuacao = Pontuacao.pontuar(i,pontuacao);
                    contador[escolhaJogador] = escolhaJogador + "=";
                    System.out.println(Arrays.toString(contador));
                    break;
                } else if (escolhaJogador < escolhaCpu) {
                    System.out.println("o numero e maior");
                    contador[escolhaJogador] = escolhaJogador + ">";

                } else if (escolhaJogador > escolhaCpu) {
                    System.out.println("o numero e menor");
                    contador[escolhaJogador] = escolhaJogador + "<";

                }
                System.out.println(Arrays.toString(contador));

            }
            System.out.println("o numero era " + escolhaCpu);
            System.out.println(" ");
            System.out.println("sua pontuação é de:"+pontuacao);
            System.out.println(" ");
            System.out.println("voce quer jogar de novo \n[1]sim\n[2]nao");

            byte continuar = scanner.nextByte();
            if (continuar == 1) {
                jogar = true;
                Espaco.espaco();
                System.out.println("começou");
            } else {
                jogar = false;
            }
        }
    }
}
