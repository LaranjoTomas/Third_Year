package lab09.ex3.startypes;

import java.awt.Graphics;

public class PositionedStar {
    private StarType star;
    private int x;
    private int y;

    public PositionedStar(StarType star, int x, int y) {
        this.star = star;
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics graphics) {
        star.draw(graphics, x, y);
    }
}