package Dominio;

public class Pontuacao {
    public static int pontuar(int contador, int pontuar) {
        if (contador == 0) {
            pontuar += 5;
        }
        if (contador == 1) {
            pontuar += 3;
        }
        if (contador == 2) {
            pontuar += 2;
        }
        if (contador == 3) {
            pontuar += 1;
        }
        return pontuar;
    }
}
