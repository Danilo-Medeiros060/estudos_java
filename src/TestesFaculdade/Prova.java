package TestesFaculdade;

import java.util.Scanner;

public class Prova {

    public static void main(String args[]) {

        Scanner x = new Scanner(System.in);

        Classe1 y =  new Classe1();

        int entrada;

        entrada = x.nextInt();

        if(entrada != 1)

            y.metodo1();

        else

            y.metodo2();

    }

}