package lab09.ex3;

import javax.swing.*;

import lab09.ex3.startypes.PositionedStar;
import lab09.ex3.startypes.StarType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Sky extends JFrame {
    private List<PositionedStar> stars = new ArrayList<>(); // Changed StarType to PositionedStar

    public void placeStar(StarType star, int x, int y) {
        stars.add(new PositionedStar(star, x, y));
    }

    @Override
    public void paint(Graphics graphics) {
        for (PositionedStar star : stars) { // Changed StarType to PositionedStar
            star.draw(graphics);
        }
    }

    public void placeStar(char type, int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'placeStar'");
    }
}