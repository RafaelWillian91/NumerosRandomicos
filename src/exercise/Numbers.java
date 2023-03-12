package exercise;

import java.util.Random;

public class Numbers {

    private int dice1;
    private int dice2;


    public Numbers(int a, int b){
        dice1 = a;
        dice2 = b;
    }

    @Override
    public String toString() {
        return "Numbers:" +
                "\nDice1= " + dice1 +
                "\nDice2= " + dice2;
    }
}
