package exercise;

import java.util.Random;

public class Dice {

    final Random random = new Random();

    public Numbers roll(){
       return new Numbers(nextInt(), nextInt());
    }

    private int nextInt(){
        return random.nextInt(1, 7);
    }



}
