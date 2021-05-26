public class Prova {

    public static void main(String args[]) {

        Exemplo aux = new Exemplo();

        int cont;

        for(cont=1;cont<=3;cont+=2){

            if(cont>3)

                aux.metodo1();

            else

                aux.metodo2();

        }

    }

}