package ClassRandom;

import java.util.Random;
//Alem da Classe Math com o metodo estatico .random. Temos a Classe Random que pode gerar numeros
public class Main {

    public static void main(String[] args) {

        Random r = new Random();//No construtor posso passar um numero Long conhecido com semente que gera sempre a mesmos
                                //numeros. Se usar o default a geracao é aleatoria devido ao construtor chamar outro que leva
                                //em conta a hora do sistema

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10, 20));
        }

    }

}
