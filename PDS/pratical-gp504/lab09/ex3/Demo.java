package lab09.ex3;

import java.awt.Color;

public class Demo {
    static int CANVAS_SIZE = 1200;
    static int STARS_TO_DRAW = 1000000;

    public static void main(String[] args) {
        Sky sky = new Sky();

        char[] starTypes = { 'O', 'B', 'A', 'F', 'G', 'K', 'M' };
        char type = starTypes[0]; // Initialize with a default value

        Runtime runtime = Runtime.getRuntime();
        long before = runtime.totalMemory() - runtime.freeMemory();

        int repeatCount = 8;
        for (int i = 0; i < STARS_TO_DRAW; i++) {
            if (i % repeatCount == 0) {
                // Change the star type every 'repeatCount' iterations
                type = starTypes[random(0, starTypes.length - 1)];
            }
            int x = random(0, CANVAS_SIZE);
            int y = random(0, CANVAS_SIZE);
            sky.placeStar(type, x, y);
        }
        sky.setSize(CANVAS_SIZE, CANVAS_SIZE);
        sky.setBackground(Color.BLACK);
        sky.setVisible(true);

        long after = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory: " + (after - before) / 1024 / 1024 + " MB");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}