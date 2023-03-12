package geracaoDenumerosEmIntervalo;

public class Main {

    public static void main(String[] args) {

        for (int i =0; i <= 10; i++){
            int a = random(10, 15);
            System.out.println(a);
        }

    }

    private static int random(int from, int to){
        return (int) (Math.random() * (from - to + 1)) + from;
    }

}
