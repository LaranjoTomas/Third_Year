package lab09.ex3;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import lab09.ex3.startypes.*;

public class Solution {
    static int CANVAS_SIZE = 1200;
    static int STARS_TO_DRAW = 1000000;

    private static final Map<Character, StarType> starMap = new HashMap<>();

    public static void main(String[] args) {
        Sky sky = new Sky();
    
        char[] starTypes = { 'O', 'B', 'A', 'F', 'G', 'K', 'M' };
        char type;
    
        Runtime runtime = Runtime.getRuntime();
        long before = runtime.totalMemory() - runtime.freeMemory();
    
        for (int i = 0; i < STARS_TO_DRAW; i++) {
            type = starTypes[random(0, starTypes.length - 1)];
            int x = random(0, CANVAS_SIZE);
            int y = random(0, CANVAS_SIZE);
            sky.placeStar(createStar(type), x, y);
        }
        sky.setSize(CANVAS_SIZE, CANVAS_SIZE);
        sky.setBackground(Color.BLACK);
        sky.setVisible(true);
    
        long after = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory: " + (after - before) / 1024 / 1024 + " MB");
    }

    private static StarType createStar(char type) {
        StarType star = starMap.get(type);
        if (star == null) {
            switch (type) {
                case 'O':
                    star = new OStar();
                    break;
                case 'A':
                    star = new AStar();
                    break;
                case 'B':
                    star = new BStar();
                    break;
                case 'F':
                    star = new FStar();
                    break;
                case 'G':
                    star = new GStar();
                    break;
                case 'K':
                    star = new KStar();
                    break;
                case 'M':
                    star = new MStar();
                    break;
            }
            starMap.put(type, star);
        }
        return star;
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}