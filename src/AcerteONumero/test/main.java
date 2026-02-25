package AcerteONumero.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean jogar = true;

        System.out.println("voce tem 4 tentativas\nso escolha numeros de 0 a 10");

        while (jogar) {
            String[] contador = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

            int escolhaCpu = random.nextInt(0, 11);

            for (int i = 0; i < 5; i++) {

                if (i == 4) {
                    System.out.println("acabou suas tentativas");
                    System.out.println("o numero era "+escolhaCpu);
                    break;
                }

                int escolhaJogador = scanner.nextInt();

                if (escolhaJogador < 0 || escolhaJogador > 10) {
                    System.out.println("somente numeros de 0 a 10");
                    continue;
                }

                if (escolhaJogador == escolhaCpu) {
                    System.out.println("voce ganhou");
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
            System.out.println("voce quer jogar de novo \n[1]sim\n[2]nao");

            byte continuar = scanner.nextByte();
            if (continuar == 1) {
                jogar = true;
                System.out.println("começou");
            } else {
                jogar = false;
            }
        }
    }
}
