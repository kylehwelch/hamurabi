package hamurabi.src.main.java;


import java.util.Random;


public class Bushels {
    public static int harvest(int acres) {
        Random harv = new Random();
        int num = harv.nextInt(6 - 1 + 1) + 1;
        return acres * num;
    }

    public static int grainEatenByRats(int bushels) {
        if (Math.random() <= 0.40) {
            double num = (Math.random() * 0.20) + .10;
            double eaten = num * bushels;
            return (int) eaten;
        }
        return 0;
    }
}



